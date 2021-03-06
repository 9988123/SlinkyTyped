organization := "org.scalablytyped.slinky"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-f063f1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "pino" % "6.3-dt-20200613Z-40c61c",
  "org.scalablytyped.slinky" %%% "pino-http" % "5.0-dt-20200623Z-a14c7d",
  "org.scalablytyped.slinky" %%% "pino-std-serializers" % "2.4-dt-20200515Z-edc12e",
  "org.scalablytyped.slinky" %%% "sonic-boom" % "0.7-dt-20190819Z-745314",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
