name := "chronos"

organization := "org.apache.mesos"

version := "3.0.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  //runtime deps versions
  val akkaVersion = "2.3.16"
  val cassandraDriverCoreVersion = "3.1.2"
  val chaosVersion = "0.8.7"
  val commonsMath3Version = "3.2"
  val commonsCodecVersion = "1.10"
  val commonsEmailVersion = "1.3.3"
  val commonsLang3Version = "3.5"
  val curatorFrameworkVersion = "2.11.0"
  val guavaVersion = "16.0.1"
  val jgraphtVersion = "1.0.0"
  val jodaConvertVersion = "1.8"
  val jodaTimeVersion = "2.9.6"
  val lz4Version = "1.3.0"
  val mesosUtilsVersion = "1.0.1"
  val metricsVersion = "3.1.0"
  val ravenVersion = "7.8.0"

  //test deps versions
  val akkaTestkitVersion = "2.3.16"
  val junitVersion = "4.12"
  val mockitoVersion = "1.9.5"
  val specs2Version = "3.7"

  Seq(
    "mesosphere" % "chaos_2.11" % chaosVersion,
    "mesosphere" % "mesos-utils_2.11" % mesosUtilsVersion,
    "com.google.guava" % "guava" % guavaVersion,
    "joda-time" % "joda-time" % jodaTimeVersion,
    "org.joda" % "joda-convert" % jodaConvertVersion,
    "org.jgrapht" % "jgrapht-core" % jgraphtVersion,
    "org.jgrapht" % "jgrapht-ext" % jgraphtVersion,
    "org.apache.curator" % "curator-framework" % curatorFrameworkVersion,
    "org.apache.curator" % "curator-recipes" % curatorFrameworkVersion,
    "io.dropwizard.metrics" % "metrics-graphite" % metricsVersion,
    "com.datastax.cassandra" % "cassandra-driver-core" % cassandraDriverCoreVersion,
    "net.jpountz.lz4" % "lz4" % lz4Version,
    "com.typesafe.akka" % "akka-actor_2.11" % akkaVersion,
    "com.getsentry.raven" % "raven" % ravenVersion,
    "org.apache.commons" % "commons-email" % commonsEmailVersion,
    "org.apache.commons" % "commons-math3" % commonsMath3Version,
    "commons-codec" % "commons-codec" % commonsCodecVersion,
    "org.apache.commons" % "commons-lang3" % commonsLang3Version,
    "com.typesafe.akka" % "akka-testkit_2.11" % akkaTestkitVersion % "test",
    "junit" % "junit" % junitVersion % "test",
    "org.mockito" % "mockito-core" % mockitoVersion % "test",
    "org.specs2" % "specs2-core_2.11" % specs2Version % "test",
    "org.specs2" % "specs2-mock_2.11" % specs2Version % "test",
    "org.specs2" % "specs2-junit_2.11" % specs2Version % "test",
    "org.apache.curator" % "curator-test" % curatorFrameworkVersion % "test"
  )
}

// Maven
publishMavenStyle := true

