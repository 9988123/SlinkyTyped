organization := "org.scalablytyped.slinky"
name := "javascript-obfuscator"
version := "1.9.0-9b6ab4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "acorn" % "7.3.1-a5a09a",
  "org.scalablytyped.slinky" %%% "eslint" % "7.2-dt-20200611Z-e1f739",
  "org.scalablytyped.slinky" %%% "eslint-scope" % "3.7-dt-20180217Z-48454e",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200623Z-09977c",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200609Z-920bb6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
