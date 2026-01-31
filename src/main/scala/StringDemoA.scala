import java.lang.reflect.Modifier

object StringDemoA {
  def main(args: Array[String]): Unit = {

    var greetings = "Hello World!" // datatype string is not defined .  Auto Interpreted
    println(greetings)

    var scala: String = "Welcome to Scala!" // datatype string defined

    println(scala)

    // Method to get length of the string
    var lengthOfString = greetings.length()
    println("Length of the string greetings : greetings " + lengthOfString)

    // concat method
    var var1 = "Saidulu"
    var var2 = "Golla"
    var var0 = var1 + var2

    println(var1 + var2)
    println(var0.length)
    var var3 = "Maithili"
    var var4 = "Golla"

    println(var3.concat((var4)))
    println((var3 + var4).length)
    println(var0.charAt(7))




    //Equals Method

    var varA = "Hello Scala"
    var varB = "Hello India"
    println(varA.equals(varB)) // It gives true of both strings are having same  contents

    println(varA == varB) // Note : same as  equals .But  does  one additional step. It first check varA and varB are not Null.

    // String Formatting
    var nameOfCar = "Mercedes"
    var costOfCar = 500000
    var milageOfCar = 9.6
    printf("Name of the car is %s and cost of the car is %d and milage of the car is %f", nameOfCar, costOfCar, milageOfCar)

  // Multi Line String  Use 3 double inverted commas """ string """ also use pipe symbol and stripMargin function for orientation
    var multiLineString =
         """
        |Hello
        |world
        |How
        |Are you
        |""".stripMargin
        println(multiLineString)

    // String Interpolation
    // 1. 's' String Interpolation

    var name = "PM Modi"
    println("Hello " + name + ", How are you")   // using concat
    println("Hello $name, How are you")          // usings interpolator. widely used

    // 2. 'f' interpolator
    name = "PM Modi"
    var salary = 20000.2
    println(f"Name is $name%S and salary is $salary%8.2f and designation is PM")

    //3. Raw Interpolator -- same as s interpolator but  does not perform escaping. escaping  - /n /t

    println(s"Hello world!\nHow are you?")
    println(raw"Hello world!\nHow a re you?")

    }
}