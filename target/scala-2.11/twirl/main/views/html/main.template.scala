
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*3.2*/active/*3.8*/(clss: String, path: String) = {{
    if(request.path.startsWith(path)) {
        s"""$clss $clss--active"""
    } else {
        s"$clss"
    }
}};
Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*9.2*/("""

"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(/*14.17*/title),format.raw/*14.22*/(""" """),format.raw/*14.23*/("""- Rick Smith</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
        <!--[if !IE]> --><link rel="stylesheet" media="screen" href=""""),_display_(/*18.71*/routes/*18.77*/.Assets.versioned("stylesheets/main.min.css")),format.raw/*18.122*/(""""><!-- <![endif]-->
        """),_display_(/*19.10*/Html(s"""<!--[if lte IE 9 ]><link rel="stylesheet" media="screen" href="${routes.Assets.versioned("stylesheets/ie.min.css")}"><![endif]-->\n"""+
        s"""<!--[if lt IE 9 ]><script src="${routes.Assets.versioned("javascripts/ie8.js")}"></script><![endif]-->""")),format.raw/*20.119*/("""
    """),format.raw/*21.5*/("""</head>
    <body onload="initialize()">
        <header id="header" role="banner">
            <a class="logo" href=""""),_display_(/*24.36*/routes/*24.42*/.Application.index()),format.raw/*24.62*/("""">Rick Smith</a>
                <div class="nav">
                    <input id="navSwitch" type="checkbox">
                    <label class="navSwitch-label" for="navSwitch"></label>
                    <nav class="nav--bar">
                        <a class="nav-item" href=""""),_display_(/*29.52*/routes/*29.58*/.Application.about()),format.raw/*29.78*/("""">About</a>
                        <a class="nav-item" href=""""),_display_(/*30.52*/routes/*30.58*/.Application.events()),format.raw/*30.79*/("""">Events</a>
                        <a class="nav-item" href=""""),_display_(/*31.52*/routes/*31.58*/.Application.media()),format.raw/*31.78*/("""">Media</a>
                        <a class="nav-item" href=""""),_display_(/*32.52*/routes/*32.58*/.Application.contact()),format.raw/*32.80*/("""">Contact</a>
                    </nav>
                </div>
        </header>

        """),_display_(/*37.10*/content),format.raw/*37.17*/("""

"""),format.raw/*39.1*/("""<!--         <footer id="footer" role="contentinfo"> 
            <nav class="nav--bar_footer">
                 <a class="nav-item_footer" href=""""),_display_(/*41.52*/routes/*41.58*/.Application.about()),format.raw/*41.78*/("""">About</a>
                <a class="nav-item_footer" href=""""),_display_(/*42.51*/routes/*42.57*/.Application.events()),format.raw/*42.78*/("""">Events</a>
                <a class="nav-item_footer" href=""""),_display_(/*43.51*/routes/*43.57*/.Application.media()),format.raw/*43.77*/("""">Media</a>
                <a class="nav-item_footer" href=""""),_display_(/*44.51*/routes/*44.57*/.Application.contact()),format.raw/*44.79*/("""">Contact</a> 
                <div class="social">
                    <a class="nav-item_footer i-twitter" href="#">Twitter</a>
                    <a class="nav-item_footer i-googlePlus" href="#">Google Plus</a>
                    <a class="nav-item_footer i-linkedIn" href="#">LinkedIn</a>
                    <a class="nav-item_footer i-facebook" href="#">Facebook</a>
                </div>
            </nav>
        </footer> -->

        <script type="text/javascript" src="//static.cdn.prismic.io/prismic.min.js"></script>
    </body>
</html>
"""))}
  }

  def render(title:String,content:Html,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(request)

  def f:((String) => (Html) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (request) => apply(title)(content)(request)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Apr 05 20:59:40 PDT 2015
                  SOURCE: /Users/Monica/Desktop/ricksmith/app/views/main.scala.html
                  HASH: f61cc1b142bce547ac35d60133659c2999cff713
                  MATRIX: 523->1|657->67|670->73|846->64|874->219|903->221|980->271|1006->276|1035->277|1374->589|1389->595|1456->640|1512->669|1797->932|1829->937|1975->1056|1990->1062|2031->1082|2338->1362|2353->1368|2394->1388|2484->1451|2499->1457|2541->1478|2632->1542|2647->1548|2688->1568|2778->1631|2793->1637|2836->1659|2955->1751|2983->1758|3012->1760|3186->1907|3201->1913|3242->1933|3331->1995|3346->2001|3388->2022|3478->2085|3493->2091|3534->2111|3623->2173|3638->2179|3681->2201
                  LINES: 19->1|21->3|21->3|28->1|30->9|32->11|35->14|35->14|35->14|39->18|39->18|39->18|40->19|41->20|42->21|45->24|45->24|45->24|50->29|50->29|50->29|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|58->37|58->37|60->39|62->41|62->41|62->41|63->42|63->42|63->42|64->43|64->43|64->43|65->44|65->44|65->44
                  -- GENERATED --
              */
          