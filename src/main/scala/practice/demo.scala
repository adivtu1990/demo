class Student(id:Int, name:String){
  def show(){
    println(id+" "+name)
  }
}
object MainObject{
  def main(args:Array[String]){
    val s = new Student(100,"Martin")
    s.show()
  }
}


//class Student(id:Int, name:String){
//    var age:Int = 0
//    def showDetails(){
//        println(id+" "+name+" "+age)
//    }
//    def this(id:Int, name:String,age:Int){
//        this(id,name)       // Calling primary constructor, and it is first line
//        this.age = age
//    }
//}
//
//object MainObject{
//    def main(args:Array[String]){
//        var s = new Student(101,"Aditya",1001);
//        s.showDetails()
//    }
//}
