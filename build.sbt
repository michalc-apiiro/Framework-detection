ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "logging-example",
    version := "0.1",
    libraryDependencies ++= Seq(
      // SLF4J API
      "org.slf4j" % "slf4j-api" % "2.0.9",
      // SLF4J Binding for Log4j
      "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.20.0",
      // Log4j Core (logging implementation)
      "org.apache.logging.log4j" % "log4j-core" % "2.20.0",
      // TinyLog Core
      "org.tinylog" % "tinylog-api" % "2.6.2",
      "org.tinylog" % "tinylog-impl" % "2.6.2"
    )
  )