
class demoClass2(val a:Int, val b:Double, val c:String) {
  val x = a
  val y = b
  val z = c

  def addNumber() :Double = {
    x + y 
  }
  println(s"x - ${}, and y - ${y}, and z - ${z}")
}

object constructorDemo2 {
  def main(args: Array[String]): Unit = {
    val demoObject1 = new demoClass2(5,7.2,"Hello World")
    val demoObject2 = new demoClass2(6,8.3,"Hello World Again")

    print(demoObject1.x,demoObject1.y, demoObject1.z)
    var result =demoObject1.addNumber()
    println(s"result - ${}")

    print(demoObject2.x, demoObject2.y, demoObject2.z)
    result = demoObject2.addNumber()
    println(s"result - ${}")


  }
}

