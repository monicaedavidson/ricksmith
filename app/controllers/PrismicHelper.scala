package controllers


import io.prismic._
import models.{NewsAppearance, Block, Event}
import play.api.Play.current
import play.api._
import play.api.i18n.Lang
import play.api.libs.concurrent.Execution.Implicits._
import play.api.mvc._

import scala.collection.immutable.Seq
import scala.concurrent._

/**
 * This Prismic object contains several helpers that make it easier
 * to build your application using both Prismic.io and Play:
 *
 * It reads some configuration from the application.conf file.
 *
 * The debug and error messages emitted by the Scala Kit are redirected
 * to the Play application Logger.
 */
object PrismicHelper extends PrismicController {

  // -- Define the key name to use for storing the Prismic.io access token into the Play session
  private val ACCESS_TOKEN = "ACCESS_TOKEN"

  // -- Cache to use (default to keep 200 JSON responses in a LRU cache)
  private val Cache = BuiltInCache(500)

  // -- Write debug and error messages to the Play `prismic` logger (check the configuration in application.conf)
  private val Logger = (level: Symbol, message: String) => level match {
    case 'DEBUG => play.api.Logger("prismic").debug(message)
    case 'ERROR => play.api.Logger("prismic").error(message)
    case _      => play.api.Logger("prismic").info(message)
  }

  private val Proxy: Option[ProxyServer] = {
    val host: Option[String] = Play.configuration.getString("proxy.host")
    val port: Option[Int] = Play.configuration.getInt("proxy.port")

    if(host.nonEmpty && port.nonEmpty) {
      Some(ProxyServer(host.get, port.get))
    } else { None }
  }

  // Helper method to read the Play application configuration
  private def config(key: String) =
    Play.configuration.getString(key).getOrElse(sys.error(s"Missing configuration [$key]"))

  // -- Define a `Prismic request` that contain both the original request and the Prismic call context
  case class Request[A](request: play.api.mvc.Request[A], ctx: Context) extends WrappedRequest(request)
  case class I18nRequest[A](request: play.api.mvc.Request[A], lang: Lang, ctx: Context) extends WrappedRequest(request)

  // -- A Prismic context that help to keep the reference to useful primisc.io contextual data
  case class Context(api: Api, ref: String, accessToken: Option[String], linkResolver: DocumentLinkResolver) {
    def hasPrivilegedAccess = accessToken.isDefined
  }

  object Context {
    implicit def fromRequest(implicit req: Request[_]): Context = req.ctx
    implicit def fromI18nRequest(implicit req: I18nRequest[_]): Context = req.ctx
  }

  // -- Build a Prismic context
  def buildContext(implicit request: RequestHeader) = {
    val maybeAccessToken = Play.configuration.getString("prismic.token")
    apiHome(maybeAccessToken) map { api =>
      val ref = {
        // First check if there is a preview token in a cookie
        request.cookies.get(io.prismic.Prismic.previewCookie).map(_.value)
      }.orElse {
        // Otherwise check if user must see a specific experiment variation
        request.cookies.get(io.prismic.Prismic.experimentsCookie).map(_.value).flatMap(api.experiments.refFromCookie)
      }.getOrElse {
        // Otherwise use the master ref
        api.master.ref
      }
      Context(api, ref, maybeAccessToken, Application.linkResolver(api)(request))
    }
  }

  // -- Retrieve the Prismic Context from a request handled by an built using Prismic.action
  def ctx(implicit req: Request[_]) = req.ctx

  // -- Fetch the API entry document
  def apiHome(token: Option[String] = None) =
    Api.get(config("prismic.api"), accessToken = token, proxy = Proxy, cache = Cache, logger = Logger)

  // API Calls
  def getGroup(typ: String)(implicit ctx: PrismicHelper.Context): Future[Seq[Document]] =
    ctx.api.forms("everything")
      .query(Predicate.at("document.type", typ))
      .ref(ctx.ref).submit().map(_.results.toSeq)

  def getBySlug(typ: String, slug: String)(implicit ctx: PrismicHelper.Context): Future[Option[Document]] =
    ctx.api.forms("everything")
      .query(Predicate.at(s"my.$typ.slug", slug))
      .ref(ctx.ref).submit().map(_.results.headOption)

  def getEvents()(implicit ctx: Context): Future[Seq[Event]] =
    getGroup("event").map(_.map(Event))

  def getBlocks()(implicit ctx: Context): Future[Seq[Block]] =
    getGroup("block").map(_.map(Block))

  def getNewsAppearances()(implicit ctx: Context): Future[Seq[NewsAppearance]] =
    getGroup("news-appearance").map(_.map(NewsAppearance))

  def getBlock(slug: String)(implicit ctx: Context): Future[Option[Block]] =
    getBySlug("block", slug).map(_.map(Block))

  def getDocument(id: String)(implicit ctx: PrismicHelper.Context): Future[Option[Document]] =
    ctx.api.forms("everything")
      .query(Predicate.at("document.id", id))
      .ref(ctx.ref).submit() map(_.results.headOption)

  // -- Helper: Retrieve several documents by Id
  def getDocuments(ids: Seq[String])(implicit ctx: PrismicHelper.Context): Future[Seq[Document]] =
    ids match {
      case Nil => Future.successful(Nil)
      case ids => ctx.api.forms("everything")
        .query(Predicate.in("document.id", ids))
        .ref(ctx.ref).submit().map(_.results.toSeq)
    }

  // -- Helper: Retrieve a single document from its bookmark
  def getBookmark(bookmark: String)(implicit ctx: PrismicHelper.Context): Future[Option[Document]] =
    ctx.api.bookmarks.get(bookmark).map(id => getDocument(id)).getOrElse(Future.successful(None))

  // -- Preview Action
  def preview(token: String) = PrismicAction { implicit req =>
    ctx.api.previewSession(token, ctx.linkResolver, routes.Application.index.url).map { redirectUrl =>
      Redirect(redirectUrl).withCookies(Cookie(io.prismic.Prismic.previewCookie, token, path = "/", maxAge = Some(30 * 60), httpOnly = false))
    }
  }
}
