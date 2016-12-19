
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

     object addProduct_Scope1 {
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(addProductForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.40*/("""

"""),format.raw/*7.102*/("""

"""),_display_(/*9.2*/main("Add Product")/*9.21*/ {_display_(Seq[Any](format.raw/*9.23*/("""
	"""),format.raw/*10.2*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*13.3*/form(action = routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form")/*13.102*/ {_display_(Seq[Any](format.raw/*13.104*/("""
		
		"""),format.raw/*15.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*17.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*17.81*/("""
		"""),_display_(/*18.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*18.95*/("""

		"""),_display_(/*20.4*/select(
			addProductForm("category.id"),
			
			options(Category.options),
			'_label -> "Category", '_default -> "-- Choose a category --",
			'_showConstraints -> false, 'class -> "form-control"
		)),format.raw/*26.4*/("""
		"""),_display_(/*27.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*27.83*/("""
		"""),_display_(/*28.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*28.83*/("""

		"""),format.raw/*30.3*/("""<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*31.4*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*31.71*/("""

	"""),format.raw/*33.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*36.14*/routes/*36.20*/.HomeController.products()),format.raw/*36.46*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*39.3*/(""" """),format.raw/*39.4*/("""<!-- End Form definition -->

""")))}),format.raw/*41.2*/(""" """),format.raw/*41.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm) => apply(addProductForm)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 17:26:36 GMT 2016
                  SOURCE: /home/wdd/webapps/playlab_crud-part4/app/views/addProduct.scala.html
                  HASH: 5ea2bed434b7bb227a1eb1c3da02fe95622f1070
                  MATRIX: 818->110|951->148|981->251|1009->254|1036->273|1075->275|1104->277|1225->372|1334->471|1375->473|1408->479|1529->574|1627->651|1657->655|1769->746|1800->751|2021->952|2051->956|2151->1035|2181->1039|2281->1118|2312->1122|2397->1181|2485->1248|2515->1251|2673->1382|2688->1388|2735->1414|2836->1485|2864->1486|2925->1517|2953->1518
                  LINES: 30->5|35->5|37->7|39->9|39->9|39->9|40->10|43->13|43->13|43->13|45->15|47->17|47->17|48->18|48->18|50->20|56->26|57->27|57->27|58->28|58->28|60->30|61->31|61->31|63->33|66->36|66->36|66->36|69->39|69->39|71->41|71->41
                  -- GENERATED --
              */
          