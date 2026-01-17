// program : Auxiliary constructors
// we  can have multiple auxiliary constructors, which provide alternative ways to create instances.

class demoClass5(val a:Int, val b : Double, val c : String) {
  val x = a
  val y = b
  val z = c

  println(s" Primary Constructor says: x-${x}, and y-${y}, and z-${z}")
  def addNumber() :Double = {
    x + y
  }
def this() = {
  this(99, 00.00,"Hello Scala")
  println("I came into  Auxiliary constructor with 0 parameters")
}

  def this(a:Int) = {
    this(a,86.89, "Hello Scala")
    println("I came into  auxiliary constructor with 1 parameters")
}
  def this(a:Int, b:Float) = {
    this (a, b, "Hello World")
    println("I came into  auxiliary constructor with 2 parameters")
  }
}

object constructorDemo5 {
  def main(args: Array[String]): Unit = {
    val demoObject1 = new demoClass4(9,5.4,"Hello Dolly")
    val demoObject2 = new demoClass4()
  }

}
