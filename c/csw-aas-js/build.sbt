organization := "org.scalablytyped.slinky"
name := "csw-aas-js"
version := "2.0.1-SNAPSHOT.1-2f5840"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-c880b4",
  "org.scalablytyped.slinky" %%% "keycloak-js" % "11.0.0-8c2e0f",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-9fd6d8",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-c528cd",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
