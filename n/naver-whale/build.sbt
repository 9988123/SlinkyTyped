organization := "org.scalablytyped.slinky"
name := "naver-whale"
version := "0.0-unknown-dt-20200515Z-1e64ae"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chrome" % "0.0-unknown-dt-20200723Z-6a1c67",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20200515Z-b3c95b",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20200515Z-2031ea",
  "org.scalablytyped.slinky" %%% "har-format" % "1.2-dt-20200515Z-59702c",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
