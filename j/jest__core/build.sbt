organization := "org.scalablytyped.slinky"
name := "jest__core"
version := "26.2.2-dfc677"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20200515Z-4c21fd",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-aecf54",
  "org.scalablytyped.slinky" %%% "collect-v8-coverage" % "1.0.1-435912",
  "org.scalablytyped.slinky" %%% "emittery" % "0.7.1-ca917b",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-479a1b",
  "org.scalablytyped.slinky" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-58a2b5",
  "org.scalablytyped.slinky" %%% "jest-changed-files" % "26.2.0-de0a4b",
  "org.scalablytyped.slinky" %%% "jest-haste-map" % "24.9.0-c4df0b",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-abf4e5",
  "org.scalablytyped.slinky" %%% "jest-resolve" % "24.9.0-cbb684",
  "org.scalablytyped.slinky" %%% "jest-runner" % "26.2.2-a35505",
  "org.scalablytyped.slinky" %%% "jest-runtime" % "26.2.2-200b8a",
  "org.scalablytyped.slinky" %%% "jest-watcher" % "26.2.0-3b625a",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-81b850",
  "org.scalablytyped.slinky" %%% "jest__environment" % "26.2.0-02872b",
  "org.scalablytyped.slinky" %%% "jest__reporters" % "26.2.2-132182",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-a0a83e",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-d525be",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-4f6068",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
