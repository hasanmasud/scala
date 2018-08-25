package nl.masud.scala3rdedition.controlabstruction

object CurrtingTest {

  def main(args: Array[String]): Unit = {
    print(curriedSum(1)(2))
  }

  def curriedSum(x: Int)(y: Int) = x + y

}
