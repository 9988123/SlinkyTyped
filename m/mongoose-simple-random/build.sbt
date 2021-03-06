organization := "org.scalablytyped.slinky"
name := "mongoose-simple-random"
version := "0.4-dt-20200515Z-df5957"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20200515Z-f9be85",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20200624Z-f0ff63",
  "org.scalablytyped.slinky" %%% "mongoose" % "5.7.13-dt-20200715Z-d2d6bf",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
