// program : 3 : Default parameters in constructor

class demoClass4(val a:Int = 99, val b : Double = 88.88, val c : String = "Hello Scala") {
  val x = a
  val y = b
  val z = c
  def addNumber() :Double = {
    x + y
  }
  println(s"x-${x}, and y-${y}, and z-${z}")
}


object constructorDemo4 {
  def main(args: Array[String]): Unit = {
    val demoObject1 = new demoClass4(5,9.4,"Hello Dolly")
    val demoObject2 = new demoClass4(20)
 //   val demoObject3 = new demoClass4("Hello") --> You need to pass parameters in correct sequence only
    val demoObject4  = new demoClass4(c = "Saidulu")
    val demoObject5  = new demoClass4(c = "Dolly", a = 5, b = 25.5)
    val demoObject6 = new demoClass4(c = "Dolly",a = 6, b = 11.9)
  }

}
