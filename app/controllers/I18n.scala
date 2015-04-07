package controllers

import scala.collection.immutable.Seq

import play.api._
import play.api.i18n._
import play.api.mvc._

import Play.current

object I18n extends Controller {

  def defaultLang: Lang = Lang.availables.head

  def lang(implicit request: RequestHeader): Lang = {
    request.cookies.get("language") match {
      case Some(cookie) => Lang.get(cookie.value).getOrElse(Lang.preferred(request.acceptLanguages))
      case None => Lang.preferred(request.acceptLanguages)
    }
  }

  def lang(code: String)(implicit request: RequestHeader): Lang = Lang.get(code).getOrElse(I18n.lang)

  def code(implicit request: RequestHeader): String = lang.code
  def name(implicit request: RequestHeader, lang: Lang): String = msg("language.name")(lang)
  def dir(implicit request: RequestHeader, lang: Lang): String = msg("language.dir")(lang)

  def getLocales(implicit request: RequestHeader): Seq[Locale] = {
    Lang.availables.to[collection.immutable.Seq]
      .map(n => Locale(n.code, msg("language.name")(n), msg("language.dir")(n)) )
      .sortWith((e1: Locale, e2: Locale) => (e1.name compareToIgnoreCase e2.name) < 0)
  }

  def msg(key: String, args: Any*)(implicit lang : play.api.i18n.Lang): String = {
    var message = Messages(key, args: _*)(lang)

    if(message.equals(key)) {
      message = Messages(key, args: _*)(this.defaultLang)
    }

    message
  }
}

case class UndefinedMessageException(msg: String = "The message cannot be found.") extends RuntimeException(msg)

case class Locale(code: String, name: String, dir: String)(implicit request: RequestHeader)
