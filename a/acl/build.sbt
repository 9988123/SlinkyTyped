organization := "org.scalablytyped.slinky"
name := "acl"
version := "0.4-dt-20200226Z-e60572"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200520Z-6ce100",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-3172ef",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20200515Z-3565c2",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-49be3e",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200515Z-35525e",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200515Z-f4fc10",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200515Z-2900a9",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20200518Z-608e56",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-8e6135",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-0a4f98",
  "org.scalablytyped.slinky" %%% "redis" % "2.8-dt-20200515Z-673315",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-85de9b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
