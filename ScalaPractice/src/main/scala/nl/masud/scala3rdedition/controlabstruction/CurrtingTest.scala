package nl.masud.scala3rdedition.controlabstruction

object CurrtingTest {

  def main(args: Array[String]): Unit = {
    println(curriedSum(1)(2))

    val onePlus = curriedSum(1) _
    println(onePlus(10))

  }

  def curriedSum(x: Int)(y: Int) = x + y

}
