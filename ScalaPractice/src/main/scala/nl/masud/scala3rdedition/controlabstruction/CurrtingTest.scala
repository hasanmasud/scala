package nl.masud.scala3rdedition.controlabstruction

object CurrtingTest {


  def main(args: Array[String]): Unit = {
    val addOne = curriedSum(1);
    print(addOne(2))
  }

  def curriedSum(x: Int)(y: Int) = (y: Int) => x + y


}
