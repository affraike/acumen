name := "Acumen"
version := "1.0"
scalaVersion := "2.12.8"                  // or any other Scala version >= 2.10.2

// Import the ScalaJS library
scalaJSUseMainModuleInitializer := true   // this is an application with a main method
mainClass in Compile := Some("hello.Hello3")
enablePlugins(ScalaJSPlugin)

//Import the DOM library
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"

// Import the JQuery library
libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"
skip in packageJSDependencies := false
jsDependencies += "org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"

// Li Haoyi Scalatags project
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.8.2"
