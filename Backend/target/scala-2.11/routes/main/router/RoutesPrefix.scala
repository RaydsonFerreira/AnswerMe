
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/raydson/answerme/conf/routes
// @DATE:Thu Nov 22 13:44:12 BRST 2018


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
