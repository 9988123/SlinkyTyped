organization := "org.scalablytyped.slinky"
name := "prosemirror-schema-list"
version := "1.0-dt-20200515Z-72a0f5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20200515Z-3521ac",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.7-dt-20200515Z-4c83fe",
  "org.scalablytyped.slinky" %%% "prosemirror-state" % "1.2-dt-20200629Z-21d601",
  "org.scalablytyped.slinky" %%% "prosemirror-transform" % "1.1-dt-20191101Z-772f76",
  "org.scalablytyped.slinky" %%% "prosemirror-view" % "1.15-dt-20200629Z-466931",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
