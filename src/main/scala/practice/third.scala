package practice

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

object third {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("test")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    import sqlContext.implicits._
    val TS = Seq((1001,"aditya")).toDF("number","word")
    TS.show()

  }

}
