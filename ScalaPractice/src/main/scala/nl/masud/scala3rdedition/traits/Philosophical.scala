package nl.masud.scala3rdedition.traits

trait Philosophical {

  def philosopize() = {
    println("Here I am")
  }

}

class Frog private(val name: String, val age: Int) extends Philosophical {
  override def toString: String = "green"

  def this(name: String) = {
    this(name, 20)
  }


  override def philosopize(): Unit = {
    super.philosopize()
    println(s"${name} ${age}")
  }

}

object Frog {

  def apply(name: String) = new Frog(name)

  def apply(name: String, age: Int) = new Frog(name, age)

}


object Test {
  def main(args: Array[String]): Unit = {

    val frog = Frog("Viaks", 34)

    frog.philosopize()

  }
  
}
