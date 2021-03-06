organization := "org.scalablytyped.slinky"
name := "gulp-protractor"
version := "v1.0.0-dt-20200515Z-71827a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.4.1-d27a9c",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200706Z-07f914",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20200515Z-14ac91",
  "org.scalablytyped.slinky" %%% "gulp" % "4.0-dt-20200515Z-f0240b",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-f9bd51",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "undertaker" % "1.2-dt-20200515Z-dcff78",
  "org.scalablytyped.slinky" %%% "undertaker-registry" % "1.0-dt-20200515Z-d2bf77",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200515Z-68d52f",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20200515Z-2b79a2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
