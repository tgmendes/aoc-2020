import Dependencies._

ThisBuild / scalaVersion     := "2.13.3"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "advent2020",
    libraryDependencies ++= Seq(
//      scalaTest % Test,
      "org.scalatest" %% "scalatest" % "3.1.0" % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
