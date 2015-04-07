
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
object contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Block,RequestHeader,PrismicHelper.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(block: Block)(implicit request: RequestHeader, ctx: PrismicHelper.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.77*/("""

"""),_display_(/*3.2*/main("Contact")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""  
"""),format.raw/*4.1*/("""<div class="banner" style="background-image: url("""),_display_(/*4.51*/block/*4.56*/.banner.map(_.main.url)),format.raw/*4.79*/("""); width:100%">
    <div class="banner-heading">
        """),_display_(/*6.10*/block/*6.15*/.heading.map/*6.27*/ { heading =>_display_(Seq[Any](format.raw/*6.40*/("""
            """),_display_(/*7.14*/Html(heading.asHtml(ctx.linkResolver))),format.raw/*7.52*/("""
        """)))}),format.raw/*8.10*/("""
    """),format.raw/*9.5*/("""</div>
</div>
    <div class="banner-content-container">
		<div class="bannerQuote-container">
			"""),_display_(/*13.5*/block/*13.10*/.bannerQuote.map/*13.26*/ { bannerQuote =>_display_(Seq[Any](format.raw/*13.43*/("""
			    """),format.raw/*14.8*/("""<blockquote class="bannerQuote-quote">"""),_display_(/*14.47*/bannerQuote),format.raw/*14.58*/("""</blockquote>
			""")))}),format.raw/*15.5*/("""
			"""),_display_(/*16.5*/block/*16.10*/.bannerAuthor.map/*16.27*/ { bannerAuthor =>_display_(Seq[Any](format.raw/*16.45*/("""
			    """),format.raw/*17.8*/("""<figcaption class="bannerQuote-author">"""),_display_(/*17.48*/bannerAuthor),format.raw/*17.60*/("""</figcaption>
			""")))}),format.raw/*18.5*/("""
		"""),format.raw/*19.3*/("""</div>
		<div class="content-formatting"> 
		"""),_display_(/*21.4*/block/*21.9*/.content.map/*21.21*/ { content =>_display_(Seq[Any](format.raw/*21.34*/("""
		    """),_display_(/*22.8*/Html(content.asHtml(ctx.linkResolver))),format.raw/*22.46*/("""
		""")))}),format.raw/*23.4*/("""
        """),format.raw/*24.9*/("""</div> 
    </div>
    <div class="contact-form">
        <script src="//app-abb.marketo.com/js/forms2/js/forms2.min.js"></script>
        <form id="mktoForm_1201"></form>
        <script>MktoForms2.loadForm("//app-abb.marketo.com", "685-IGO-543", 1201);</script>
    </div>
""")))}),format.raw/*31.2*/("""


"""))}
  }

  def render(block:Block,request:RequestHeader,ctx:PrismicHelper.Context): play.twirl.api.HtmlFormat.Appendable = apply(block)(request,ctx)

  def f:((Block) => (RequestHeader,PrismicHelper.Context) => play.twirl.api.HtmlFormat.Appendable) = (block) => (request,ctx) => apply(block)(request,ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 05 20:59:40 PDT 2015
                  SOURCE: /Users/Monica/Desktop/ricksmith/app/views/contact.scala.html
                  HASH: cd6a083adfe5ebdc02740b47d479d88026be57b6
                  MATRIX: 542->1|705->76|733->79|756->94|795->96|824->99|900->149|913->154|956->177|1040->235|1053->240|1073->252|1123->265|1163->279|1221->317|1261->327|1292->332|1417->431|1431->436|1456->452|1511->469|1546->477|1612->516|1644->527|1692->545|1723->550|1737->555|1763->572|1819->590|1854->598|1921->638|1954->650|2002->668|2032->671|2104->717|2117->722|2138->734|2189->747|2223->755|2282->793|2316->797|2352->806|2658->1082
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|25->4|27->6|27->6|27->6|27->6|28->7|28->7|29->8|30->9|34->13|34->13|34->13|34->13|35->14|35->14|35->14|36->15|37->16|37->16|37->16|37->16|38->17|38->17|38->17|39->18|40->19|42->21|42->21|42->21|42->21|43->22|43->22|44->23|45->24|52->31
                  -- GENERATED --
              */
          