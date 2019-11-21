organization := "org.scalablytyped.slinky"
name := "expo-file-system"
version := "7.0.0-148303"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-7d274f",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1735fa",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191025Z-c3107a",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191028Z-f78437",
  "org.scalablytyped.slinky" %%% "std" % "3.7-5d968d",
  "org.scalablytyped.slinky" %%% "unimodules__core" % "4.0.0-5e7f92",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-92ccc4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        