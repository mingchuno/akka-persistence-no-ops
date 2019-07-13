import Keys._
import xerial.sbt.Sonatype._

val akkaVersion = "2.5.23"

lazy val root = Project(
  id = "akka-persistence-no-ops",
  base = file(".")
).settings(
  name := "akka-persistence-no-ops",
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % "test",
    "com.typesafe.akka" %% "akka-persistence-tck" % akkaVersion % "test",
  ),
  organization := "com.github.mingchuno",
  scalaVersion := "2.12.4",
  version      := "0.1.0",
  crossScalaVersions := Seq("2.11.12", "2.12.4"),
  scalacOptions ++= Seq(
    "-unchecked",
    "-deprecation",
    "-feature",
    "-language:existentials",
    "-language:implicitConversions",
    "-language:higherKinds",
    "-language:postfixOps",
    "-Xfuture"
  ),
  parallelExecution in Test := false,
  fork in Test := true,
  testOptions in Test += Tests.Argument("-oD"),
  publishTo := SonatypeKeys.sonatypePublishTo.value,
  publishMavenStyle := true,
  homepage := Some(url("https://github.com/mingchuno/akka-persistence-no-ops")),
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/mingchuno/akka-persistence-no-ops"),
      "scm:git@github.com:mingchuno/akka-persistence-no-ops.git"
    )
  ),
  developers := List(
    Developer(id = "mingchuno", name = "Or Ming Chun", email = "mingchuno@gmail.com", url = url("https://github.com/mingchuno"))
  ),
  licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
)
