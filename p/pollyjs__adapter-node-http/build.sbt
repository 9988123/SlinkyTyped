organization := "org.scalablytyped.slinky"
name := "pollyjs__adapter-node-http"
version := "2.0-dt-20200515Z-ab0f1a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "pollyjs__adapter" % "4.3-dt-20200526Z-02af9e",
  "org.scalablytyped.slinky" %%% "pollyjs__core" % "4.3-dt-20200526Z-b69fd3",
  "org.scalablytyped.slinky" %%% "pollyjs__persister" % "4.3-dt-20200526Z-5b6f70",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
