//program no 1

class demoClass1 {
  val x = 5
  val y = 6

  def addNumber() : Int = {
    x + y
  }

  println(s"x - ${x} and y - ${y}")

  val z  = addNumber()

  println(s"z - ${z}")
}


object constructorDemoScala {
  def main(args: Array[String]): Unit = {
    println("Welcome to Constructor Demo")
  }

}
