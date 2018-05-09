/*
trait Printable{
  def print()
  def  deep(): Unit ={
    println("hello scala")
  }
}

trait statitable{
  def show()
}

trait admin{
  def display()
}
class A4 extends Printable with statitable with admin {
  def print(){
    println("Hello, this is A4 Sheet")
  }
  def show(){
    println("hello")
  }
  def display(): Unit ={
    println("hello word")
  }
}


object fourth {
  def main(args: Array[String]) {
    var a = new A4()
    a.print()
    a.show()
    a.display()
    a.deep()

  }
}


trait Print{
  def print()
}

abstract class PrintA4{
  def printA4()
}

class A6 extends PrintA4 with Print{            // First one is abstract class second one is trait
  def print(){                                        // Trait print
    println("print sheet")
  }
  def printA4(){                                      // Abstract class printA4
    println("Print A4 Sheet")
  }
}

object fourth{
  def main(args:Array[String]){
    var a = new A6()
    a.print()
    a.printA4()
  }
}

*/

class AccessExample{
     protected var a:Int = 10
}
class SubClass extends AccessExample{
    def display(){
        println("a = "+a)
    }
}
object fourth{
    def main(args:Array[String]){
        var s = new SubClass()

        s.display()

    }
}