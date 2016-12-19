
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playlab_crud-part4/conf/routes
// @DATE:Mon Dec 19 17:26:35 GMT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
