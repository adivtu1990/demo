trait Printable{
  def print()
}

class A4 extends Printable{
  def print(){
    println("Hello word")
  }
}

object fourth {
  def main(args: Array[String]) {
    var a = new A4()
    a.print()
  }
}

