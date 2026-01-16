//program no 2 : parametrized constructor (primary constructor)

class demoClass1 (val a:Int, val b:Double, val c:String){
  val x = a
  val y = b
  val z = c

  def addNumber(): Double = {
    x + y
  }

  println(s"x - ${x} and y - ${y} and z -${z}")


}


object constructorDemo1 {
  def main(args: Array[String]): Unit = {
    val demoObject1 = new demoClass1(5,8.6, "Welcome Saidulu to Scala Constructor learning") // Object : Instence of class --> constructor
  }

}
