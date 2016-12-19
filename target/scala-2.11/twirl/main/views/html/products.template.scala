
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Product],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products")/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.HomeController.products(0)),format.raw/*11.60*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*15.18*/for(c <- categories) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
                    """),format.raw/*16.21*/("""<a href=""""),_display_(/*16.31*/routes/*16.37*/.HomeController.products(c.getId)),format.raw/*16.70*/("""" class="list-group-item">"""),_display_(/*16.97*/c/*16.98*/.getName),format.raw/*16.106*/("""
                      """),format.raw/*17.23*/("""<span class="badge">"""),_display_(/*17.44*/c/*17.45*/.getProducts.size()),format.raw/*17.64*/("""</span>
                    </a>
                """)))}),format.raw/*19.18*/("""
            """),format.raw/*20.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*24.12*/if(flash.containsKey("success"))/*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
              """),format.raw/*25.15*/("""<div class="alert alert-success">
              """),_display_(/*26.16*/flash/*26.21*/.get("success")),format.raw/*26.36*/("""
              """),format.raw/*27.15*/("""</div>
          """)))}),format.raw/*28.12*/("""
          """),format.raw/*29.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*44.12*/for(p <- products) yield /*44.30*/ {_display_(Seq[Any](format.raw/*44.32*/("""
			        """),format.raw/*45.12*/("""<tr>
                  <td>"""),_display_(/*46.24*/p/*46.25*/.getId),format.raw/*46.31*/("""</td>
                  <td>"""),_display_(/*47.24*/p/*47.25*/.getName),format.raw/*47.33*/("""</td>
                  <td>"""),_display_(/*48.24*/p/*48.25*/.getCategory.getName),format.raw/*48.45*/("""</td>
                  <td>"""),_display_(/*49.24*/p/*49.25*/.getDescription),format.raw/*49.40*/("""</td>
                  <td>"""),_display_(/*50.24*/p/*50.25*/.getStock),format.raw/*50.34*/("""</td>
                  <td>&euro; """),_display_(/*51.31*/("%.2f".format(p.getPrice))),format.raw/*51.58*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*55.33*/routes/*55.39*/.HomeController.updateProduct(p.getId)),format.raw/*55.77*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*60.33*/routes/*60.39*/.HomeController.deleteProduct(p.getId)),format.raw/*60.77*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				    </tr>
					""")))}),format.raw/*66.7*/(""" """),format.raw/*66.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*70.21*/routes/*70.27*/.HomeController.addProduct()),format.raw/*70.55*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*79.27*/("""{"""),format.raw/*79.28*/("""
        """),format.raw/*80.9*/("""return confirm('Are you sure?');
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""
  """),format.raw/*82.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(products,categories)

  def f:((List[models.Product],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (products,categories) => apply(products,categories)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 17:26:36 GMT 2016
                  SOURCE: /home/wdd/webapps/playlab_crud-part4/app/views/products.scala.html
                  HASH: 4ff2b80ef4e3691a7033ab1cf2937e316194d9c3
                  MATRIX: 787->1|949->68|977->70|1037->103|1065->104|1111->123|1139->124|1167->125|1214->147|1238->163|1277->165|1306->168|1572->407|1587->413|1635->440|1886->664|1922->684|1962->686|2011->707|2048->717|2063->723|2117->756|2171->783|2181->784|2211->792|2262->815|2310->836|2320->837|2360->856|2441->906|2482->919|2571->981|2612->1013|2652->1015|2695->1030|2771->1079|2785->1084|2821->1099|2864->1114|2913->1132|2952->1143|3444->1608|3478->1626|3518->1628|3558->1640|3613->1668|3623->1669|3650->1675|3706->1704|3716->1705|3745->1713|3801->1742|3811->1743|3852->1763|3908->1792|3918->1793|3954->1808|4010->1837|4020->1838|4050->1847|4113->1883|4161->1910|4297->2019|4312->2025|4371->2063|4630->2295|4645->2301|4704->2339|4961->2566|4989->2567|5109->2660|5124->2666|5173->2694|5436->2929|5465->2930|5501->2939|5565->2976|5593->2977|5623->2980
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|42->11|42->11|42->11|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|86->55|86->55|86->55|91->60|91->60|91->60|97->66|97->66|101->70|101->70|101->70|110->79|110->79|111->80|112->81|112->81|113->82
                  -- GENERATED --
              */
          