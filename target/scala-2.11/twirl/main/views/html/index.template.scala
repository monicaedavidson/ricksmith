
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[collection.immutable.Seq[Event],RequestHeader,PrismicHelper.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: collection.immutable.Seq[Event])(implicit request: RequestHeader, ctx: PrismicHelper.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.104*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<div class="banner-hero">
    <div class="banner-text">
        <div class="banner-row">       
            <h1 class="banner-heading"> Rick Smith</h1>
        </div>
    </div>
</div>
<div class="bannerQuote-container">
    <blockquote class="bannerQuote-quote">Rick is awesome</blockquote>
    <figcaption class="bannerQuote-author">Billy</figcaption>
</div>
<section class="content-container">
    <h1>Upcoming Events</h1>
        <div class="events-upcoming">
            """),_display_(/*18.14*/for(event <- events.take(2)) yield /*18.42*/ {_display_(Seq[Any](format.raw/*18.44*/("""
                """),_display_(/*19.18*/components/*19.28*/.event(event)),format.raw/*19.41*/("""
            """)))}),format.raw/*20.14*/("""
        """),format.raw/*21.9*/("""</div>
        <button class="btn events-btn"><a href=""""),_display_(/*22.50*/routes/*22.56*/.Application.events()),format.raw/*22.77*/("""">More Events</a></button>
    <div class="twitter">
        <h1>Follow Rick</h1>
        <a class="twitter-timeline"   width="600"
        height="300" href="https://twitter.com/RickTASER" data-widget-id="575056010374553600">Tweets by @RickTASER</a>
        <script>!function(d,s,id)"""),format.raw/*27.34*/("""{"""),format.raw/*27.35*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*27.143*/("""{"""),format.raw/*27.144*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*27.257*/("""}"""),format.raw/*27.258*/("""}"""),format.raw/*27.259*/("""(document,"script","twitter-wjs");</script>
    </div>
</section>

    <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false">
    </script>
    <script src=""""),_display_(/*33.19*/routes/*33.25*/.Assets.versioned("javascripts/gmaps.coffee")),format.raw/*33.70*/(""""></script>
""")))}),format.raw/*34.2*/("""
"""))}
  }

  def render(events:collection.immutable.Seq[Event],request:RequestHeader,ctx:PrismicHelper.Context): play.twirl.api.HtmlFormat.Appendable = apply(events)(request,ctx)

  def f:((collection.immutable.Seq[Event]) => (RequestHeader,PrismicHelper.Context) => play.twirl.api.HtmlFormat.Appendable) = (events) => (request,ctx) => apply(events)(request,ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 05 20:59:40 PDT 2015
                  SOURCE: /Users/Monica/Desktop/ricksmith/app/views/index.scala.html
                  HASH: 2fbec18a1e05556906fd2ab9b6978ee20094291c
                  MATRIX: 566->1|757->103|785->106|816->129|855->131|882->132|1386->609|1430->637|1470->639|1515->657|1534->667|1568->680|1613->694|1649->703|1732->759|1747->765|1789->786|2101->1071|2130->1072|2267->1180|2297->1181|2439->1294|2469->1295|2499->1296|2715->1485|2730->1491|2796->1536|2839->1549
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|39->18|39->18|39->18|40->19|40->19|40->19|41->20|42->21|43->22|43->22|43->22|48->27|48->27|48->27|48->27|48->27|48->27|48->27|54->33|54->33|54->33|55->34
                  -- GENERATED --
              */
          