package models

import io.prismic.Document
import io.prismic.Fragment._

case class NewsAppearance(document: Document) extends PrismicDocument {
  val aprType: String = document.getText(s"$typ.aprType").getOrElse("quote")
  val image: Option[Image] = document.getImage(s"$typ.image")
  val headline: Option[StructuredText] = document.getStructuredText(s"$typ.headline")
  val quote: Option[StructuredText] = document.getStructuredText(s"$typ.quote")
  val date: Option[Date] = document.getDate(s"$typ.date")
  val link: Option[WebLink] = document.getLink(s"$typ.link").collect{case l: WebLink => l.asInstanceOf[WebLink]}

}