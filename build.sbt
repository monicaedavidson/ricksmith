name := """ricksmith"""



lazy val root = (project in file(".")).enablePlugins(PlayScala)
  //.settings(updateOptions := updateOptions.value.withCachedResolution(true))

scalaVersion := "2.11.4"

resolvers += "Prismic.io kits" at "https://s3.amazonaws.com/prismic-maven-kits/repository/maven/"

resolvers += "Netty snapshots" at "http://clinker.netty.io/nexus/content/repositories/snapshots"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  filters,
  "io.prismic" %% "scala-kit" % "1.2.17",
  "org.webjars" %% "webjars-play" % "2.3.0",
  "org.webjars" % "html5shiv" % "3.7.2",
  "com.github.detro.ghostdriver" % "phantomjsdriver" % "1.0.4" % Test,
  "com.mohiva" %% "play-html-compressor" % "0.3"
)

pipelineStages := Seq(uglify, digest, gzip)

includeFilter in (Assets, LessKeys.less) := "*.less"

excludeFilter in (Assets, LessKeys.less) := "_*.less"

//compressed output for LESS files
LessKeys.compress in Assets := true

//don't output source map
LessKeys.sourceMap := false

CoffeeScriptKeys.sourceMap := false

//avoid good test data being overwritten
javaOptions += "-Djunit.outdir=target/junit-test-reports"


fork in run := true
