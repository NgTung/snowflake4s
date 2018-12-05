organization := "septech.snowflake4s"
name := "Snowflake4s"

version := "0.0.1"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1",
  "com.google.inject" % "guice" % "4.1.0",
  "net.codingwell" %% "scala-guice" % "4.1.0"
)

licenses := List(
  ("Apache License, Version 2.0", url("https://www.apache.org/licenses/LICENSE-2.0"))
)
homepage := Some(url("https://github.com/NgTung/snowflake4s"))

pomExtra :=
  <scm>
    <connection>scm:git:git://github.com/NgTung/snowflake4s.git</connection>
    <url>https://github.com/NgTung/snowflake4s.git</url>
  </scm>
    <developers>
      <developer>
        <id>NgTung</id>
        <name>TungNT</name>
        <email>tungnt.fami.hut@gmail.com</email>
      </developer>
    </developers>

publishTo := Some(
  "bintray" at "https://api.bintray.com/maven/ngtung/snowflake4s/snowflake4s/;publish=1"
)

packagedArtifacts in publish ~= { m =>
  val classifiersToExclude = Set(
    Artifact.SourceClassifier,
    Artifact.DocClassifier
  )
  m.filter { case (art, _) =>
    art.classifier.forall(c => !classifiersToExclude.contains(c))
  }
}

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")
publishMavenStyle := true
publishArtifact in Test := false