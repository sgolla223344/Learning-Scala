object StringDemoA {
  def main(args: Array[String]): Unit = {

    var greetings = "Hello World!"  // datatype string is not defined .  Auto Interpreted
    println(greetings)

    var scala:  String = "Welcome to Scala!" // datatype string defined

    println(scala)

    // Method to get length of the string
    var lengthOfString = greetings.length()
    println("Length of the string greetings : greetings " + lengthOfString)
  }

}
