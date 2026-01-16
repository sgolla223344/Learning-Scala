// simple class and object demo
// Method with side effect
// access levels in scala
//public can access any where here(By default)
//private can access only in the class it is defined
//protected can  access  in the class it is defined  as well as in subclass extending the given class using inheritance



class car {
  var topClassExtraCost = 0
  var roadTax = 100
//  protected var xyz = 10

  def cost(basicCost:Int) = basicCost + topClassExtraCost + roadTax //+xyz

  def checkTax(): Int = {
    roadTax
  }
}

//class smallCar extends car {
//  println(xyz)
//}
object demoClassObject {
  def main(args: Array[String]): Unit = {
    println("My is car BMW")

    var bmw = new car
    bmw.topClassExtraCost = 500
    println("Road tax is " + bmw.checkTax())

    var result =bmw.cost(basicCost =1000)
    println(result)
//    println(bmw.roadTax)
//    bmw.roadTax = 200
//    println(bmw.roadTax)
  }

}
