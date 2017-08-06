import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.glassdome",
      scalaVersion := "2.12.3",
      version      := "0.1.0"
    )),
    name := "translate-service",
    libraryDependencies += scalaTest % Test
)

shellPrompt in ThisBuild := { state => "\033[0;36m" + Project.extract(state).currentRef.project + "\033[0m] " }
  