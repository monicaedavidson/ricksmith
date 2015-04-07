
package views.html

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
object about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Block,RequestHeader,PrismicHelper.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(block: Block)(implicit request: RequestHeader, ctx: PrismicHelper.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.77*/("""

"""),_display_(/*3.2*/main("About Rick")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
"""),format.raw/*4.1*/("""<div class="wrapper">
    """),_display_(/*5.6*/components/*5.16*/.block(block)),format.raw/*5.29*/("""
"""),format.raw/*6.1*/("""</div>
""")))}),format.raw/*7.2*/("""
"""))}
  }

  def render(block:Block,request:RequestHeader,ctx:PrismicHelper.Context): play.twirl.api.HtmlFormat.Appendable = apply(block)(request,ctx)

  def f:((Block) => (RequestHeader,PrismicHelper.Context) => play.twirl.api.HtmlFormat.Appendable) = (block) => (request,ctx) => apply(block)(request,ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 05 20:59:40 PDT 2015
                  SOURCE: /Users/Monica/Desktop/ricksmith/app/views/about.scala.html
                  HASH: 19e48651733a46e1aa4b4729b73a50a0571a8993
                  MATRIX: 540->1|703->76|731->79|757->97|796->99|823->100|875->127|893->137|926->150|953->151|990->159
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|26->5|26->5|26->5|27->6|28->7
                  -- GENERATED --
              */
          