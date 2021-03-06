organization := "org.scalablytyped.slinky"
name := "material__data-table"
version := "7.0.0-123e79"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "material__base" % "7.0.0-16f095",
  "org.scalablytyped.slinky" %%% "material__checkbox" % "7.0.0-a3e74e",
  "org.scalablytyped.slinky" %%% "material__ripple" % "7.0.0-8a5776",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
