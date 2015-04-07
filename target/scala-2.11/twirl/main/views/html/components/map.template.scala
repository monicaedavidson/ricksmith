
package views.html.components

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object map extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Double,Double,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(latitude: Double, longitude: Double):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""
"""))}
  }

  def render(latitude:Double,longitude:Double): play.twirl.api.HtmlFormat.Appendable = apply(latitude,longitude)

  def f:((Double,Double) => play.twirl.api.HtmlFormat.Appendable) = (latitude,longitude) => apply(latitude,longitude)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 05 20:59:40 PDT 2015
                  SOURCE: /Users/Monica/Desktop/ricksmith/app/views/components/map.scala.html
                  HASH: 2f37f171d2e3e0d80b762bb064ecc6060243cd17
                  MATRIX: 521->1|646->38
                  LINES: 19->1|22->1
                  -- GENERATED --
              */
          