class program1(val a:Int, val b:Double, val c:String) {

  val x = a
  val y = b
  val z = c

  def addNumber():Double = {
    x + y
  }
  println(s"x - ${x} and y - ${y} and z - ${z}")
}

object programObject1 {
  def main(args: Array[String]): Unit = {
    val programObject1 = new program1(28,56.8,"Saidulu Leaning scala")  //object :Instance of class -->  calls Constructor


    // println(programObject1.x, programObject1.y,programObject1.z)
    val result = programObject1.addNumber()
    println(s"result - ${result}")


  }

}
