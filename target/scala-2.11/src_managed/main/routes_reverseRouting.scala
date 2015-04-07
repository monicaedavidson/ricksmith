// @SOURCE:/Users/Monica/Desktop/ricksmith/conf/routes
// @HASH:a100e288762c27be4f8e927bd9440b3e40f58f61
// @DATE:Sun Apr 05 20:59:39 PDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:22
class ReverseWebJarAssets {


// @LINE:22
def at(file:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:21
// @LINE:12
class ReverseAssets {


// @LINE:12
def at(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/images"), ("file", "favicon.ico")))
   Call("GET", _prefix + { _defaultPrefix } + "favicon.ico")
}
                        

// @LINE:21
def versioned(file:Asset): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
}
                        

}
                          

// @LINE:9
class ReversePrismicHelper {


// @LINE:9
def preview(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "preview" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("token", token)))))
}
                        

}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:10
// @LINE:6
class ReverseApplication {


// @LINE:17
def media(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "media")
}
                        

// @LINE:15
def about(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                        

// @LINE:10
def brokenLink(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "error")
}
                        

// @LINE:6
def untrail(path:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("path", path) + "/")
}
                        

// @LINE:16
def events(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "events")
}
                        

// @LINE:14
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:18
def contact(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                        

}
                          
}
                  


// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:22
class ReverseWebJarAssets {


// @LINE:22
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:21
// @LINE:12
class ReverseAssets {


// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "favicon.ico"})
      }
   """
)
                        

// @LINE:21
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:9
class ReversePrismicHelper {


// @LINE:9
def preview : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PrismicHelper.preview",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "preview" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("token", token)])})
      }
   """
)
                        

}
              

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:10
// @LINE:6
class ReverseApplication {


// @LINE:17
def media : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.media",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "media"})
      }
   """
)
                        

// @LINE:15
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:10
def brokenLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.brokenLink",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error"})
      }
   """
)
                        

// @LINE:6
def untrail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.untrail",
   """
      function(path) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path) + "/"})
      }
   """
)
                        

// @LINE:16
def events : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.events",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events"})
      }
   """
)
                        

// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:18
def contact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        

}
              
}
        


// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:22
class ReverseWebJarAssets {


// @LINE:22
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      

}
                          

// @LINE:21
// @LINE:12
class ReverseAssets {


// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """favicon.ico""")
)
                      

// @LINE:21
def versioned(path:String, file:Asset): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:9
class ReversePrismicHelper {


// @LINE:9
def preview(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PrismicHelper.preview(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.PrismicHelper", "preview", Seq(classOf[String]), "GET", """ Home page""", _prefix + """preview""")
)
                      

}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:10
// @LINE:6
class ReverseApplication {


// @LINE:17
def media(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.media(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "media", Seq(), "GET", """""", _prefix + """media""")
)
                      

// @LINE:15
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:10
def brokenLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.brokenLink(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "brokenLink", Seq(), "GET", """""", _prefix + """error""")
)
                      

// @LINE:6
def untrail(path:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.untrail(path), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "untrail", Seq(classOf[String]), "GET", """ Remove trailing slashes""", _prefix + """$path<.+>/""")
)
                      

// @LINE:16
def events(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.events(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "events", Seq(), "GET", """""", _prefix + """events""")
)
                      

// @LINE:14
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:18
def contact(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "contact", Seq(), "GET", """""", _prefix + """contact""")
)
                      

}
                          
}
        
    