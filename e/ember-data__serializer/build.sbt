organization := "org.scalablytyped.slinky"
name := "ember-data__serializer"
version := "3.15-dt-20200515Z-8dba63"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ember" % "3.1-dt-20200515Z-6c95da",
  "org.scalablytyped.slinky" %%% "ember-data" % "3.1-dt-20200515Z-35c8b2",
  "org.scalablytyped.slinky" %%% "ember__application" % "3.0-dt-20200515Z-6158f3",
  "org.scalablytyped.slinky" %%% "ember__array" % "3.0-dt-20200515Z-9eb892",
  "org.scalablytyped.slinky" %%% "ember__component" % "3.0-dt-20200515Z-30ddb9",
  "org.scalablytyped.slinky" %%% "ember__controller" % "3.0-dt-20200328Z-028efd",
  "org.scalablytyped.slinky" %%% "ember__debug" % "3.0-dt-20200515Z-21ae68",
  "org.scalablytyped.slinky" %%% "ember__engine" % "3.0-dt-20200515Z-a6ce79",
  "org.scalablytyped.slinky" %%% "ember__error" % "3.0-dt-20200328Z-41a078",
  "org.scalablytyped.slinky" %%% "ember__object" % "3.1-dt-20200515Z-9c117d",
  "org.scalablytyped.slinky" %%% "ember__polyfills" % "3.0-dt-20200515Z-9e6921",
  "org.scalablytyped.slinky" %%% "ember__routing" % "3.0-dt-20200512Z-7a5726",
  "org.scalablytyped.slinky" %%% "ember__runloop" % "3.0-dt-20200515Z-f82e99",
  "org.scalablytyped.slinky" %%% "ember__service" % "3.0-dt-20200328Z-7b7f1f",
  "org.scalablytyped.slinky" %%% "ember__template" % "3.0-dt-20200515Z-e75258",
  "org.scalablytyped.slinky" %%% "ember__test" % "3.0-dt-20200515Z-13e19b",
  "org.scalablytyped.slinky" %%% "ember__utils" % "3.0-dt-20200515Z-82e238",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200515Z-fefef8",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20200515Z-348428",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20200515Z-0b0d10",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
