// @SOURCE:/Users/Monica/Desktop/ricksmith/conf/routes
// @HASH:a100e288762c27be4f8e927bd9440b3e40f58f61
// @DATE:Sun Apr 05 20:59:39 PDT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_untrail0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("path", """.+""",false),StaticPart("/"))))
private[this] lazy val controllers_Application_untrail0_invoker = createInvoker(
controllers.Application.untrail(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "untrail", Seq(classOf[String]),"GET", """ Remove trailing slashes""", Routes.prefix + """$path<.+>/"""))
        

// @LINE:9
private[this] lazy val controllers_PrismicHelper_preview1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("preview"))))
private[this] lazy val controllers_PrismicHelper_preview1_invoker = createInvoker(
controllers.PrismicHelper.preview(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PrismicHelper", "preview", Seq(classOf[String]),"GET", """ Home page""", Routes.prefix + """preview"""))
        

// @LINE:10
private[this] lazy val controllers_Application_brokenLink2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("error"))))
private[this] lazy val controllers_Application_brokenLink2_invoker = createInvoker(
controllers.Application.brokenLink,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "brokenLink", Nil,"GET", """""", Routes.prefix + """error"""))
        

// @LINE:12
private[this] lazy val controllers_Assets_at3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("favicon.ico"))))
private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """favicon.ico"""))
        

// @LINE:14
private[this] lazy val controllers_Application_index4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index4_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:15
private[this] lazy val controllers_Application_about5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
private[this] lazy val controllers_Application_about5_invoker = createInvoker(
controllers.Application.about,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "about", Nil,"GET", """""", Routes.prefix + """about"""))
        

// @LINE:16
private[this] lazy val controllers_Application_events6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events"))))
private[this] lazy val controllers_Application_events6_invoker = createInvoker(
controllers.Application.events,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "events", Nil,"GET", """""", Routes.prefix + """events"""))
        

// @LINE:17
private[this] lazy val controllers_Application_media7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("media"))))
private[this] lazy val controllers_Application_media7_invoker = createInvoker(
controllers.Application.media,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "media", Nil,"GET", """""", Routes.prefix + """media"""))
        

// @LINE:18
private[this] lazy val controllers_Application_contact8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
private[this] lazy val controllers_Application_contact8_invoker = createInvoker(
controllers.Application.contact,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "contact", Nil,"GET", """""", Routes.prefix + """contact"""))
        

// @LINE:21
private[this] lazy val controllers_Assets_versioned9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:22
private[this] lazy val controllers_WebJarAssets_at10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_WebJarAssets_at10_invoker = createInvoker(
controllers.WebJarAssets.at(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$path<.+>/""","""controllers.Application.untrail(path:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """preview""","""controllers.PrismicHelper.preview(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """error""","""controllers.Application.brokenLink"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """favicon.ico""","""controllers.Assets.at(path:String = "/public/images", file:String = "favicon.ico")"""),("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events""","""controllers.Application.events"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """media""","""controllers.Application.media"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Application.contact"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.versioned(path:String = "/public", file:Asset)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_untrail0_route(params) => {
   call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_untrail0_invoker.call(controllers.Application.untrail(path))
   }
}
        

// @LINE:9
case controllers_PrismicHelper_preview1_route(params) => {
   call(params.fromQuery[String]("token", None)) { (token) =>
        controllers_PrismicHelper_preview1_invoker.call(controllers.PrismicHelper.preview(token))
   }
}
        

// @LINE:10
case controllers_Application_brokenLink2_route(params) => {
   call { 
        controllers_Application_brokenLink2_invoker.call(controllers.Application.brokenLink)
   }
}
        

// @LINE:12
case controllers_Assets_at3_route(params) => {
   call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("favicon.ico"))) { (path, file) =>
        controllers_Assets_at3_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:14
case controllers_Application_index4_route(params) => {
   call { 
        controllers_Application_index4_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:15
case controllers_Application_about5_route(params) => {
   call { 
        controllers_Application_about5_invoker.call(controllers.Application.about)
   }
}
        

// @LINE:16
case controllers_Application_events6_route(params) => {
   call { 
        controllers_Application_events6_invoker.call(controllers.Application.events)
   }
}
        

// @LINE:17
case controllers_Application_media7_route(params) => {
   call { 
        controllers_Application_media7_invoker.call(controllers.Application.media)
   }
}
        

// @LINE:18
case controllers_Application_contact8_route(params) => {
   call { 
        controllers_Application_contact8_invoker.call(controllers.Application.contact)
   }
}
        

// @LINE:21
case controllers_Assets_versioned9_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(controllers.Assets.versioned(path, file))
   }
}
        

// @LINE:22
case controllers_WebJarAssets_at10_route(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at10_invoker.call(controllers.WebJarAssets.at(file))
   }
}
        
}

}
     