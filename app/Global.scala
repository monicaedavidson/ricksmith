import com.googlecode.htmlcompressor.compressor.HtmlCompressor
import com.mohiva.play.htmlcompressor.HTMLCompressorFilter
import play.api._
import play.api.mvc._
import play.api.mvc.Results._

import play.filters.gzip.GzipFilter

import play.api.Play.current

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

import controllers.PrismicHelper

object Global
  extends WithFilters(
    new GzipFilter(),
    HTMLCompressorFilter()
  ) with GlobalSettings {

  override def onHandlerNotFound(request: RequestHeader): Future[Result] =
    PrismicHelper.buildContext(request).map { ctx =>
      NotFound("error")
    }
}

object HTMLCompressorFilter {

  def apply() = new HTMLCompressorFilter({
    val compressor = new HtmlCompressor()
    if (Play.isDev) {
      compressor.setPreserveLineBreaks(true)
    }

    compressor.setRemoveComments(true)
    compressor.setRemoveIntertagSpaces(true)
    compressor.setRemoveHttpProtocol(false)
    compressor.setRemoveHttpsProtocol(true)
    compressor
  })
}