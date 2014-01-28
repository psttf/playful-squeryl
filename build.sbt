organization := "com.tylip"

name := "playful-squeryl"

version := "0.1"

libraryDependencies ++= (Seq(
  "org.squeryl" %% "squeryl" % "0.9.5-2",
  "postgresql" % "postgresql" % "8.4-701.jdbc4"
))
