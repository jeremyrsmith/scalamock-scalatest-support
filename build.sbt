
name := "scalamock-scalatest-support"
organization := "io.github.jeremyrsmith"
version := "3.0.0"

scalaVersion := "2.11.8"
crossScalaVersions := Seq("2.10.5", "2.11.8")

libraryDependencies ++= Seq(
  "org.scalamock" %% "scalamock-core" % "3.2.2",
  "org.scalatest" %% "scalatest" % version.value
)

bintrayRepository := "maven"
bintrayVcsUrl := Some("https://github.com/jeremyrsmith/scalamock-scalatest-support")
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))