package models

import io.prismic.Fragment.StructuredText.Block.Heading
import io.prismic.{Fragment, HtmlSerializer, Document}
import io.prismic.Fragment.{StructuredText, Date, GeoPoint}

case class Event(document: Document) extends PrismicDocument {
  val name: Option[StructuredText] = document.getStructuredText(s"$typ.name")
  val description: Option[StructuredText] = document.getStructuredText(s"$typ.description")
  val place: Option[String] = document.getText(s"$typ.place")
  val date: Option[Date] = document.getDate(s"$typ.date")
  val time: Option[String] = document.getText(s"$typ.time")
  val geo: Option[GeoPoint] = document.getGeoPoint(s"$typ.geolocation")

  val htmlSerializer = HtmlSerializer {
    case (heading: Heading, content: String) if heading.level == 3 =>
      s"""<a href=""><h3 class="event-name">$content</h3></a>"""
  }
}