package models

import io.prismic.Fragment.{DocumentLink, Group}
import io.prismic.{Document, WithFragments}

import scala.collection.immutable.Seq

trait PrismicDocument {
  protected val document: Document

  val typ = document.typ

  implicit def optionGroup2linkIDs(group: Option[Group]): Seq[DocumentLink] =
    group.map(
      _.docs.map(doc => doc.fragments)
        .flatten
        .map{ case (key, value) => value }
        .collect{ case dl: DocumentLink => dl }
    ).getOrElse(Seq()).to[collection.immutable.Seq]
}
