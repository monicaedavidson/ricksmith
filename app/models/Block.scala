package models

import io.prismic.Document
import io.prismic.Fragment.{Image, StructuredText}

case class Block(document: Document) extends PrismicDocument {
  val slug: String = document.slug
  val banner: Option[Image] = document.getImage(s"$typ.banner")
  val heading: Option[StructuredText] = document.getStructuredText(s"$typ.heading")
  val bannerQuote: Option[String] = document.getText(s"$typ.bannerQuote")
  val bannerAuthor: Option[String] = document.getText(s"$typ.bannerAuthor")
  val content: Option[StructuredText] = document.getStructuredText(s"$typ.content")
}