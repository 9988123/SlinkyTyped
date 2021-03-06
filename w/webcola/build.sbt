organization := "org.scalablytyped.slinky"
name := "webcola"
version := "3.4.0-8163ef"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200707Z-0e074a",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200515Z-32be82",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200707Z-7e5f10",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20200515Z-cde312",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
