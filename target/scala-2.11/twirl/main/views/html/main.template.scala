
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
    </head>
    <body>
    <!-- start of nav section -->
    <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Product Catalogue</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*28.22*/if(title == "Home")/*28.41*/{_display_(Seq[Any](format.raw/*28.42*/("""class="active"""")))}),format.raw/*28.57*/("""><a href=""""),_display_(/*28.68*/routes/*28.74*/.HomeController.index()),format.raw/*28.97*/("""">Home</a></li>
                <li """),_display_(/*29.22*/if(title == "About")/*29.42*/{_display_(Seq[Any](format.raw/*29.43*/("""class="active"""")))}),format.raw/*29.58*/("""><a href=""""),_display_(/*29.69*/routes/*29.75*/.HomeController.about()),format.raw/*29.98*/("""">About Us</a></li>
                <li """),_display_(/*30.22*/if(title == "Products")/*30.45*/{_display_(Seq[Any](format.raw/*30.46*/("""class="active"""")))}),format.raw/*30.61*/("""><a href=""""),_display_(/*30.72*/routes/*30.78*/.HomeController.products()),format.raw/*30.104*/("""">Products</a></li>
            </ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*36.32*/("""
        """),_display_(/*37.10*/content),format.raw/*37.17*/("""
    """),format.raw/*38.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*47.19*/routes/*47.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*47.66*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 17:26:36 GMT 2016
                  SOURCE: /home/wdd/webapps/playlab_crud-part4/app/views/main.scala.html
                  HASH: d792cb155cf0472ead3a7552d742e0b2d16565b7
                  MATRIX: 1002->260|1127->290|1155->292|1235->397|1271->406|1306->414|1332->419|1607->667|1622->673|1685->714|1773->775|1788->781|1849->820|2256->1200|2284->1219|2323->1220|2369->1235|2407->1246|2422->1252|2466->1275|2530->1312|2559->1332|2598->1333|2644->1348|2682->1359|2697->1365|2741->1388|2809->1429|2841->1452|2880->1453|2926->1468|2964->1479|2979->1485|3027->1511|3151->1697|3188->1707|3216->1714|3248->1719|3610->2054|3625->2060|3687->2101
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|46->16|46->16|46->16|47->17|47->17|47->17|58->28|58->28|58->28|58->28|58->28|58->28|58->28|59->29|59->29|59->29|59->29|59->29|59->29|59->29|60->30|60->30|60->30|60->30|60->30|60->30|60->30|65->36|66->37|66->37|67->38|76->47|76->47|76->47
                  -- GENERATED --
              */
          