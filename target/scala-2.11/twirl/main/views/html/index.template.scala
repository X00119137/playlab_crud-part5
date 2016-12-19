
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Home")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-12">
        <div class="well">
          <h4>"""),_display_(/*9.16*/message),format.raw/*9.23*/(""" """),format.raw/*9.24*/("""- """),_display_(/*9.27*/name),format.raw/*9.31*/("""</h4>
        </div>
      </div>
  </div>
  <!-- End of content for main -->
""")))}),format.raw/*14.2*/("""

"""))
      }
    }
  }

  def render(message:String,name:String): play.twirl.api.HtmlFormat.Appendable = apply(message,name)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,name) => apply(message,name)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 17:26:36 GMT 2016
                  SOURCE: /home/wdd/webapps/playlab_crud-part4/app/views/index.scala.html
                  HASH: ff50618b087f9eed9551fc8499d7a63321029d9b
                  MATRIX: 752->1|878->32|906->34|966->67|994->68|1040->87|1068->88|1096->89|1143->111|1163->123|1202->125|1231->128|1390->261|1417->268|1445->269|1474->272|1498->276|1607->355
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|40->9|40->9|40->9|40->9|40->9|45->14
                  -- GENERATED --
              */
          