
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
object media extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[List[NewsAppearance]],RequestHeader,PrismicHelper.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(appearances: List[List[NewsAppearance]])(implicit request: RequestHeader, ctx: PrismicHelper.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.104*/("""

"""),format.raw/*3.1*/("""<div class="media-container">
"""),_display_(/*4.2*/main("Media")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
    """),_display_(/*5.6*/appearances/*5.17*/.map/*5.21*/ { set =>_display_(Seq[Any](format.raw/*5.30*/("""
        """),_display_(/*6.10*/set/*6.13*/.headOption.map/*6.28*/{ apr =>_display_(Seq[Any](format.raw/*6.36*/("""
            """),_display_(/*7.14*/apr/*7.17*/.aprType/*7.25*/ match/*7.31*/ {/*8.17*/case "video" =>/*8.32*/ {_display_(Seq[Any](format.raw/*8.34*/("""
                    """),_display_(/*9.22*/for(item <- set) yield /*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
                        """),format.raw/*10.25*/("""<div class="media-video">
                            <a href=""""),_display_(/*11.39*/apr/*11.42*/.link.map(_.getUrl(ctx.linkResolver)).getOrElse("")),format.raw/*11.93*/("""">
                            """),_display_(/*12.30*/apr/*12.33*/.image.map/*12.43*/ { image =>_display_(Seq[Any](format.raw/*12.54*/("""
                                """),format.raw/*13.33*/("""<img src=""""),_display_(/*13.44*/image/*13.49*/.main.url),format.raw/*13.58*/("""" alt="News Appearance with Rick">
                            """)))}),format.raw/*14.30*/("""
                            """),format.raw/*15.29*/("""</a>
                        </div>
                    """)))}),format.raw/*17.22*/("""
                """)))}/*21.17*/case "image" =>/*21.32*/ {_display_(Seq[Any](format.raw/*21.34*/("""
                    """),format.raw/*22.21*/("""<div class="media-image-group">
                        """),_display_(/*23.26*/for(item <- set) yield /*23.42*/ {_display_(Seq[Any](format.raw/*23.44*/("""
                            """),_display_(/*24.30*/item/*24.34*/.image.map/*24.44*/ { image =>_display_(Seq[Any](format.raw/*24.55*/("""
                                """),format.raw/*25.33*/("""<img class="media-individual" src=""""),_display_(/*25.69*/image/*25.74*/.getView("small").map(_.url).getOrElse("")),format.raw/*25.116*/("""" alt="News Appearance with Rick"/>
                            """)))}),format.raw/*26.30*/("""
                        """)))}),format.raw/*27.26*/("""
                    """),format.raw/*28.21*/("""</div>
                """)))}/*32.17*/case _ =>/*32.26*/ {_display_(Seq[Any](format.raw/*32.28*/("""
                    """),format.raw/*33.21*/("""<div class="media-article">
                        """),_display_(/*34.26*/for(item <- set) yield /*34.42*/ {_display_(Seq[Any](format.raw/*34.44*/("""
                            """),_display_(/*35.30*/item/*35.34*/.image.map/*35.44*/ { image =>_display_(Seq[Any](format.raw/*35.55*/("""
                                """),format.raw/*36.33*/("""<img src=""""),_display_(/*36.44*/image/*36.49*/.getView("small").map(_.url).getOrElse("")),format.raw/*36.91*/("""" alt="News Appearance with Rick">
                            """)))}),format.raw/*37.30*/("""
                        """),format.raw/*38.25*/("""<div class="media-headline">
                             """),_display_(/*39.31*/item/*39.35*/.headline.map/*39.48*/ { headline =>_display_(Seq[Any](format.raw/*39.62*/("""
                                 """),_display_(/*40.35*/Html(headline.asHtml(ctx.linkResolver))),format.raw/*40.74*/("""
                               """),format.raw/*41.32*/("""Description or link to article here? 
                             """)))}),format.raw/*42.31*/("""
                        """),format.raw/*43.25*/("""</div>
                        """)))}),format.raw/*44.26*/("""
                    """),format.raw/*45.21*/("""</div>
                    """)))}}),format.raw/*47.14*/("""
        """)))}/*48.10*/.getOrElse("")),format.raw/*48.24*/("""
    """)))}),format.raw/*49.6*/("""
""")))}),format.raw/*50.2*/("""
"""),format.raw/*51.1*/("""</div>





"""))}
  }

  def render(appearances:List[List[NewsAppearance]],request:RequestHeader,ctx:PrismicHelper.Context): play.twirl.api.HtmlFormat.Appendable = apply(appearances)(request,ctx)

  def f:((List[List[NewsAppearance]]) => (RequestHeader,PrismicHelper.Context) => play.twirl.api.HtmlFormat.Appendable) = (appearances) => (request,ctx) => apply(appearances)(request,ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 05 20:59:40 PDT 2015
                  SOURCE: /Users/Monica/Desktop/ricksmith/app/views/media.scala.html
                  HASH: 967507ecf534191d7b7ef375340183737346ffb4
                  MATRIX: 561->1|752->103|780->105|836->136|857->149|896->151|927->157|946->168|958->172|1004->181|1040->191|1051->194|1074->209|1119->217|1159->231|1170->234|1186->242|1200->248|1210->267|1233->282|1272->284|1320->306|1351->322|1390->324|1443->349|1534->413|1546->416|1618->467|1677->499|1689->502|1708->512|1757->523|1818->556|1856->567|1870->572|1900->581|1995->645|2052->674|2140->731|2177->768|2201->783|2241->785|2290->806|2374->863|2406->879|2446->881|2503->911|2516->915|2535->925|2584->936|2645->969|2708->1005|2722->1010|2786->1052|2882->1117|2939->1143|2988->1164|3031->1207|3049->1216|3089->1218|3138->1239|3218->1292|3250->1308|3290->1310|3347->1340|3360->1344|3379->1354|3428->1365|3489->1398|3527->1409|3541->1414|3604->1456|3699->1520|3752->1545|3838->1604|3851->1608|3873->1621|3925->1635|3987->1670|4047->1709|4107->1741|4206->1809|4259->1834|4322->1866|4371->1887|4431->1929|4460->1939|4495->1953|4531->1959|4563->1961|4591->1962
                  LINES: 19->1|22->1|24->3|25->4|25->4|25->4|26->5|26->5|26->5|26->5|27->6|27->6|27->6|27->6|28->7|28->7|28->7|28->7|28->8|28->8|28->8|29->9|29->9|29->9|30->10|31->11|31->11|31->11|32->12|32->12|32->12|32->12|33->13|33->13|33->13|33->13|34->14|35->15|37->17|38->21|38->21|38->21|39->22|40->23|40->23|40->23|41->24|41->24|41->24|41->24|42->25|42->25|42->25|42->25|43->26|44->27|45->28|46->32|46->32|46->32|47->33|48->34|48->34|48->34|49->35|49->35|49->35|49->35|50->36|50->36|50->36|50->36|51->37|52->38|53->39|53->39|53->39|53->39|54->40|54->40|55->41|56->42|57->43|58->44|59->45|60->47|61->48|61->48|62->49|63->50|64->51
                  -- GENERATED --
              */
          