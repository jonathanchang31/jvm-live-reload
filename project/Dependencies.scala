import sbt._

object Dependencies {

  val undertow = "io.undertow" % "undertow-core" % "2.3.20.Final"

  val playFileWatch = "org.playframework" % "play-file-watch" % "3.0.0-M4"
  val jline = "org.jline" % "jline" % "3.30.6"

  val zio = "dev.zio" %% "zio" % "2.1.24"
  val catsEffect = "org.typelevel" %% "cats-effect" % "3.6.3"

}
