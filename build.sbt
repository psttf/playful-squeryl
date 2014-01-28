organization := "com.tylip"

name := "playful-squeryl"

version := "0.1"

scalaVersion := "2.9.1"

libraryDependencies ++= (Seq(
	"play" %% "play" % "2.0.4" % "compile",
  "org.squeryl" %% "squeryl" % "0.9.5-2",
  "postgresql" % "postgresql" % "8.4-701.jdbc4"
))

resolvers ++= Seq(
  "Online Play Repository" at
    "http://repo.typesafe.com/typesafe/maven-releases/"
)
