package practice
import org.apache.spark.sql.{Row, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.functions._
object second {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("test_data")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    import sqlContext.implicits._
    val TS = Seq((1525328442000L, "yyyy-mm-dd")).toDF(colNames="long","date")
      .withColumn("long", col("long")/1000L)
    val newDF = TS.withColumn("long", from_unixtime(col("long"), "yyyy-MM-dd"))
    newDF.show()
  }
}

