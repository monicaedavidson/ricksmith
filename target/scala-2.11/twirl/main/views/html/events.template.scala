
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
object events extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Block,collection.immutable.Seq[Event],RequestHeader,PrismicHelper.Context,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(block: Block, events: collection.immutable.Seq[Event])(implicit request: RequestHeader, ctx: PrismicHelper.Context):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.118*/("""

"""),_display_(/*3.2*/main("Events")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
"""),format.raw/*4.1*/("""<div class="wrapper col">
  """),_display_(/*5.4*/components/*5.14*/.block(block)),format.raw/*5.27*/("""
"""),format.raw/*6.1*/("""</div>
    <div class="events">
        """),_display_(/*8.10*/events/*8.16*/.take(4).map(components.event(_))),format.raw/*8.49*/("""
        """),format.raw/*9.9*/("""<input id="show-all" class="show-all" type="checkbox">
        <label class="label-showAll" for="show-all"></label>
        <br>
        """),_display_(/*12.10*/events/*12.16*/.drop(4).map(components.event(_))),format.raw/*12.49*/("""
    """),format.raw/*13.5*/("""</div>
""")))}),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""<div class="feature">
    <div class="video">
        <iframe width="380" height="300" src="https://www.youtube.com/embed/YBkmefllgiE" frameborder="0" allowfullscreen></iframe>
    </div>
    <div class="video-about">
        <h1>See Rick in Action</h1>
        <h2>Taser Technology Summit 2014</h2>
        <hr>
        <h3>Take a look at Rick talking!</h3>
    </div>
</div>

<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false">
</script>
<script src=""""),_display_(/*30.15*/routes/*30.21*/.Assets.versioned("javascripts/gmaps.coffee")),format.raw/*30.66*/(""""></script>

"""))}
  }

  def render(block:Block,events:collection.immutable.Seq[Event],request:RequestHeader,ctx:PrismicHelper.Context): play.twirl.api.HtmlFormat.Appendable = apply(block,events)(request,ctx)

  def f:((Block,collection.immutable.Seq[Event]) => (RequestHeader,PrismicHelper.Context) => play.twirl.api.HtmlFormat.Appendable) = (block,events) => (request,ctx) => apply(block,events)(request,ctx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 05 20:59:40 PDT 2015
                  SOURCE: /Users/Monica/Desktop/ricksmith/app/views/events.scala.html
                  HASH: 20722c7deb02fffe834e8e4e459a5edf3b553936
                  MATRIX: 573->1|778->117|806->120|828->134|867->136|894->137|948->166|966->176|999->189|1026->190|1093->231|1107->237|1160->270|1195->279|1360->417|1375->423|1429->456|1461->461|1499->469|1528->471|2043->959|2058->965|2124->1010
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|26->5|26->5|26->5|27->6|29->8|29->8|29->8|30->9|33->12|33->12|33->12|34->13|35->14|37->16|51->30|51->30|51->30
                  -- GENERATED --
              */
          