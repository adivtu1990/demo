package practice

import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.types.DateType
import org.apache.spark.{SparkConf, SparkContext}

/*
class employee{
 var id:Int=111;
 var name:String="aditya";
}

object first{
  def main(args: Array[String]): Unit = {
    var e = new employee()
    println(e.id+ " " + e.name)
}
}

case class CaseClass(a:Int, b:Int)

object MainObject{
  def main(args:Array[String]){
    var c =  CaseClass(12,11)
    println("a = "+c.a)
    println("b = "+c.b)
  }
}
*/

/*
class employee{
 var id:Int=111;
 var name:String="aditya";
}

object first{
  def main(args: Array[String]): Unit = {
    var e = new employee()
    println(e.id+ " " + e.name)
}
}

case class CaseClass(a:Int, b:Int)

object MainObject{
  def main(args:Array[String]){
    var c =  CaseClass(12,11)
    println("a = "+c.a)
    println("b = "+c.b)
  }
}


class Arithmetic{
  def add(a:Int, b:Int){
    var sum = a+b
    println(sum)
  }
  def add(a:Int, b:Int, c:Int){
    var sum = a+b+c
    println(sum)
  }
}

object MainObject {
  def main(args: Array[String]) {
    var a = new Arithmetic();
    a.add(10, 10);
    a.add(10, 10, 10);
  }
}


class A{
  var salary1 = 10000
}
class b extends A{
  var salary2 = 20000
}

class c extends b{
  var salary3 = 30000
}
class d extends c{
  def show(){
    println("salary 1 = " +salary1)
    println("salary 2 = " +salary2)
    println("salary 3 = " +salary3)
  }
}

object first{
  def main(args: Array[String]): Unit = {
    var d = new d()
    d.show()
  }
}


class vehicle{
  def run(): Unit ={
    println("vehicle is running")
  }
}

class bike extends vehicle{
  override def run(): Unit = {
    println("bike is running")
  }
}


object first{
  def main(args: Array[String]): Unit = {
    var a = new bike()
    a.run()
  }
}



class car{
  val speed:Int= 60
}

class bike extends car{
  override val speed: Int =80
  def show(): Unit ={
    println(speed)
  }
}

object first{
  def main(args: Array[String]): Unit = {
    var aditya = new bike()
    aditya.show()
  }
}


abstract class Bike(a:Int){             // Creating constructor
  var b:Int = 20                      // Creating variables
var c:Int = 25
  def run()                           // Abstract method
  def performance(){                  // Non-abstract method
    println("Performance awesome")
  }
}

class Hero(a:Int) extends Bike(a){
  c = 30
  def run(){
    println("Running fine...")
    println("a = "+a)
    println("b = "+b)
    println("c = "+c)
  }
}

object MainObject{
  def main(args: Array[String]){
    var h = new Hero(10)
    h.run()
    h.performance()
  }
}



import java.util.Date
import java.text.SimpleDateFormat
object TS2Date {
  def main(args: Array[String]): Unit = {
    val ts = 1525328442 * 1000L
    val df = new SimpleDateFormat("yyyy-MM-dd")
    val date = df.format(ts)
    println(date)
  }
}

*/

object first{
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("first")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    import sqlContext.implicits._
    val someDF = Seq((8, "bat", 12345678456L), (64, "mouse", 453453453434L), (-27, "horse", 762523452346L)).toDF("number", "word", "time")

    val newDF = someDF.withColumn("dateColumn", someDF("time").cast(DateType))

    newDF.show()
  }
}

