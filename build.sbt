name := "testproject"

version := "0.1"

scalaVersion := "2.10.5"

val sparkVersion = "1.6.2"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "com.databricks" % "spark-csv_2.10" % "1.5.0",
  "org.scala-lang" % "scala-reflect" % "2.10.5")
