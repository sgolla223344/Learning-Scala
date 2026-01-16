class demoClass {
  val x = 4    // var - mutable(can change to value of variable), val - immutable(can not change)
  val y = 8

  def addNumber() : Int = {
    x + y
  }
  println(s"x - ${x} and y -${y}" )
  println("x - "+ x + " and y - " + y)
}


object constructorDemo {
  def main(args: Array[String]): Unit = {
    println("Welcome to scala constructors")

    val demoClass = new demoClass   //creating a object  - instance of class - constructor: will execute every thing in the class
  }

}
