
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
object event extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Event,PrismicHelper.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(event: Event)(implicit ctx: PrismicHelper.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*5.6*/map/*5.9*/(lat: Double, long: Double):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.40*/("""
        """),format.raw/*6.9*/("""<div id="map-canvas-placeholder"data-latitude=""""),_display_(/*6.57*/lat),format.raw/*6.60*/("""" data-longitude=""""),_display_(/*6.79*/long),format.raw/*6.83*/(""""></div>
        """)))};
Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*3.1*/("""<div class="event">
    <img src="http://placekitten.com/g/200/150">   
    """),format.raw/*7.10*/("""
    """),_display_(/*8.6*/event/*8.11*/.geo.map/*8.19*/ { geo =>_display_(Seq[Any](format.raw/*8.28*/("""
        """),_display_(/*9.10*/map(geo.latitude, geo.longitude)),format.raw/*9.42*/("""
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""<div class="background">
    """),_display_(/*12.6*/event/*12.11*/.name.map/*12.20*/ { name =>_display_(Seq[Any](format.raw/*12.30*/("""
        """),_display_(/*13.10*/Html(name.asHtml(ctx.linkResolver, event.htmlSerializer))),format.raw/*13.67*/("""
    """)))}),format.raw/*14.6*/("""

    """),_display_(/*16.6*/event/*16.11*/.description.map/*16.27*/ { desc =>_display_(Seq[Any](format.raw/*16.37*/("""
        """),_display_(/*17.10*/Html(desc.asHtml(ctx.linkResolver))),format.raw/*17.45*/(""" 
        """)))}),format.raw/*18.10*/("""

    """),_display_(/*20.6*/event/*20.11*/.date.map/*20.20*/ { date =>_display_(Seq[Any](format.raw/*20.30*/("""
        """),format.raw/*21.9*/("""<time class="event-date">"""),_display_(/*21.35*/date/*21.39*/.asText("MMMM dd, yyyy")),format.raw/*21.63*/("""</time>
    """)))}),format.raw/*22.6*/("""
    """),format.raw/*23.5*/("""</div>
</div>












"""))}
  }

  def render(event:Event,ctx:PrismicHelper.Context): play.twirl.api.HtmlFormat.Appendable = apply(event)(ctx)

  def f:((Event) => (PrismicHelper.Context) => play.twirl.api.HtmlFormat.Appendable) = (event) => (ctx) => apply(event)(ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 05 20:59:40 PDT 2015
                  SOURCE: /Users/Monica/Desktop/ricksmith/app/views/components/event.scala.html
                  HASH: 44646a09d4c9a904381690d25bffedbf18314097
                  MATRIX: 537->1|659->131|669->134|776->165|811->174|885->222|908->225|953->244|977->248|1034->52|1062->54|1165->266|1196->272|1209->277|1225->285|1271->294|1307->304|1359->336|1395->342|1427->347|1483->377|1497->382|1515->391|1563->401|1600->411|1678->468|1714->474|1747->481|1761->486|1786->502|1834->512|1871->522|1927->557|1969->568|2002->575|2016->580|2034->589|2082->599|2118->608|2171->634|2184->638|2229->662|2272->675|2304->680
                  LINES: 19->1|21->5|21->5|23->5|24->6|24->6|24->6|24->6|24->6|26->1|28->3|30->7|31->8|31->8|31->8|31->8|32->9|32->9|33->10|34->11|35->12|35->12|35->12|35->12|36->13|36->13|37->14|39->16|39->16|39->16|39->16|40->17|40->17|41->18|43->20|43->20|43->20|43->20|44->21|44->21|44->21|44->21|45->22|46->23
                  -- GENERATED --
              */
          