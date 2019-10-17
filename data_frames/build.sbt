name := "data_frames"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= (version.value match {
  case v if v.contains("spark2.3") => Seq(
    "org.apache.spark" %% "spark-core" % "2.3.2",
    "org.apache.spark" %% "spark-sql" % "2.3.2",
    "org.apache.spark" %% "spark-mllib" % "2.3.2",
    "org.apache.spark" %% "spark-hive" % "2.3.2"
  )
  case v if v.contains("spark2.2") => Seq(
    "org.apache.spark" %% "spark-core" % "2.2.0",
    "org.apache.spark" %% "spark-sql" % "2.2.0",
    "org.apache.spark" %% "spark-mllib" % "2.2.0",
    "org.apache.spark" %% "spark-hive" % "2.2.0"
  )
})