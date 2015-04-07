package controllers

import io.prismic.{Fragment, DocumentLinkResolver, Api}
import models.{NewsAppearance, Block}
import models._

import play.api.i18n.Lang
import play.api.mvc._

import scala.annotation.tailrec
import scala.concurrent.Future

import scala.concurrent.ExecutionContext.Implicits.global

object Application extends Controller with PrismicController {
  import controllers.PrismicHelper._

  // Overrides req2lang with custom language detection
  implicit def langFromRequest(implicit req: I18nRequest[_]): Lang = req.lang

  def index = PrismicAction { implicit request =>
    for {
      events <- getEvents()
    } yield Ok(views.html.index(events))
  }

  def about = PrismicAction { implicit request =>
    for {
      block <- getBlock("about")
    } yield block.map { about =>
      Ok(views.html.about(about))
    } getOrElse pageNotFound
  }

  def events = PrismicAction { implicit request =>
    for {
      block <- getBlock("events")
      events <- getEvents()
    } yield block.map { block =>
      Ok(views.html.events(block, events))
    } getOrElse pageNotFound
  }

  def media = PrismicAction { implicit request =>
    for {
      block <- getBlock("media")
      appearances <- getNewsAppearances().map(_.toList.groupBy(_.aprType))
    } yield Ok(views.html.media(intersperse(
      List(),
      appearances.getOrElse("video", List()),
      appearances.getOrElse("image", List()),
      appearances.getOrElse("article", List())
    ))
    )
  }

  @tailrec
  private def intersperse(list: List[List[NewsAppearance]], videos: List[NewsAppearance], quotes: List[NewsAppearance], images: List[NewsAppearance]): List[List[NewsAppearance]] = {
    if(videos.isEmpty && quotes.isEmpty && images.isEmpty) return list
    if(list.isEmpty && videos.nonEmpty) intersperse(List(videos.take(1)), videos.drop(3), quotes, images)
    else intersperse(list ::: List(quotes.take(4)) ::: List(images.take(4)) ::: List(videos.take(1)) ::: List(videos.drop(1).take(1)), videos.drop(2), quotes.drop(5), images.drop(4))
  }

  def contact = PrismicAction { implicit request =>
    for {
      contact <- getBookmark("contact").map(_.map(Block))
    } yield contact.map { contact =>
      Ok(views.html.contact(contact))
    } getOrElse pageNotFound
  }

  def untrail(path: String) = Action { MovedPermanently("/" + path) }

  def brokenLink = PrismicAction { implicit request =>
    Future.successful(pageNotFound)
  }

  //TODO build error page
  def pageNotFound(implicit request: RequestHeader, ctx: PrismicHelper.Context) = NotFound("Error")

  // -- Resolve links to documents
  def linkResolver(api: Api)(implicit request: RequestHeader) = DocumentLinkResolver(api) {
    case (Fragment.DocumentLink(_, _, _, _, _, _, true), _) => routes.Application.brokenLink().absoluteURL()
    case _ => routes.Application.brokenLink().absoluteURL()
  }

}