
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
object block extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Block,PrismicHelper.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(block: Block)(implicit ctx: PrismicHelper.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*3.1*/("""<div class="banner" style="background-image: url("""),_display_(/*3.51*/block/*3.56*/.banner.map(_.main.url)),format.raw/*3.79*/("""); width:100%">
    <div class="banner-heading">
        """),_display_(/*5.10*/block/*5.15*/.heading.map/*5.27*/ { heading =>_display_(Seq[Any](format.raw/*5.40*/("""
            """),_display_(/*6.14*/Html(heading.asHtml(ctx.linkResolver))),format.raw/*6.52*/("""
        """)))}),format.raw/*7.10*/("""
    """),format.raw/*8.5*/("""</div>
</div>
<div class="bannerQuote-container">
	"""),_display_(/*11.3*/block/*11.8*/.bannerQuote.map/*11.24*/ { bannerQuote =>_display_(Seq[Any](format.raw/*11.41*/("""
	    """),format.raw/*12.6*/("""<blockquote class="bannerQuote-quote">"""),_display_(/*12.45*/bannerQuote),format.raw/*12.56*/("""</blockquote>
	""")))}),format.raw/*13.3*/("""
	"""),_display_(/*14.3*/block/*14.8*/.bannerAuthor.map/*14.25*/ { bannerAuthor =>_display_(Seq[Any](format.raw/*14.43*/("""
	    """),format.raw/*15.6*/("""<figcaption class="bannerQuote-author">"""),_display_(/*15.46*/bannerAuthor),format.raw/*15.58*/("""</figcaption>
	""")))}),format.raw/*16.3*/("""
"""),format.raw/*17.1*/("""</div>
<div class="content-formatting col2"> 
    """),_display_(/*19.6*/block/*19.11*/.content.map/*19.23*/ { content =>_display_(Seq[Any](format.raw/*19.36*/("""
        """),_display_(/*20.10*/Html(content.asHtml(ctx.linkResolver))),format.raw/*20.48*/("""
"""),format.raw/*21.1*/("""</div> 
""")))}),format.raw/*22.2*/("""


"""))}
  }

  def render(block:Block,ctx:PrismicHelper.Context): play.twirl.api.HtmlFormat.Appendable = apply(block)(ctx)

  def f:((Block) => (PrismicHelper.Context) => play.twirl.api.HtmlFormat.Appendable) = (block) => (ctx) => apply(block)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 05 20:59:40 PDT 2015
                  SOURCE: /Users/Monica/Desktop/ricksmith/app/views/components/block.scala.html
                  HASH: 35da76462bb74fb0f8522aff7c2c9a994ae67055
                  MATRIX: 537->1|676->52|704->54|780->104|793->109|836->132|920->190|933->195|953->207|1003->220|1043->234|1101->272|1141->282|1172->287|1250->339|1263->344|1288->360|1343->377|1376->383|1442->422|1474->433|1520->449|1549->452|1562->457|1588->474|1644->492|1677->498|1744->538|1777->550|1823->566|1851->567|1928->618|1942->623|1963->635|2014->648|2051->658|2110->696|2138->697|2177->706
                  LINES: 19->1|22->1|24->3|24->3|24->3|24->3|26->5|26->5|26->5|26->5|27->6|27->6|28->7|29->8|32->11|32->11|32->11|32->11|33->12|33->12|33->12|34->13|35->14|35->14|35->14|35->14|36->15|36->15|36->15|37->16|38->17|40->19|40->19|40->19|40->19|41->20|41->20|42->21|43->22
                  -- GENERATED --
              */
          