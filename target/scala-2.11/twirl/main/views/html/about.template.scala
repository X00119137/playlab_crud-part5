
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!-- Pass page title and content """),format.raw/*2.34*/("""{"""),format.raw/*2.35*/("""html between braces"""),format.raw/*2.54*/("""}"""),format.raw/*2.55*/(""" """),format.raw/*2.56*/("""to the main view -->
"""),_display_(/*3.2*/main("About")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),format.raw/*4.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-12">
        <div class="well">
          <h4>Add a new Product</h4>
        </div>
      </div>
  </div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 17:26:36 GMT 2016
                  SOURCE: /home/wdd/webapps/playlab_crud-part4/app/views/about.scala.html
                  HASH: 16ba9f1a5f94bf3d2fb448f1f9dffca479f2abd7
                  MATRIX: 827->1|887->34|915->35|961->54|989->55|1017->56|1064->78|1085->91|1124->93|1153->96
                  LINES: 32->2|32->2|32->2|32->2|32->2|32->2|33->3|33->3|33->3|34->4
                  -- GENERATED --
              */
          