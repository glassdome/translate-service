import Dependencies._

shellPrompt in ThisBuild := { state => "\033[0;36m" + Project.extract(state).currentRef.project + "\033[0m] " }

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.glassdome",
      scalaVersion := "2.12.3",
      version      := "0.1.0"
    )),
    name := "translate-service"
)


libraryDependencies ++= Seq(
	"com.typesafe.play" % "play-json_2.12" 		% "2.6.2",
	"org.slf4j" 	 	% "slf4j-api" 			% "1.7.10",
	"ch.qos.logback" 	% "logback-classic" 	% "1.1.2",
	"org.specs2" 	 	% "specs2-core_2.12"    % "3.9.2" 	% "test"
)

  