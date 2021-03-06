organization := "org.scalablytyped.slinky"
name := "angular__router"
version := "10.0.7-452371"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__common" % "10.0.7-743361",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "10.0.7-0af94b",
  "org.scalablytyped.slinky" %%% "angular__core" % "10.0.7-cf8635",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200721Z-912e09",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.2-c2ee33",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.2-f90eab",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-10a9ae",
  "org.scalablytyped.slinky" %%% "typescript" % "3.9.7-155546")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
