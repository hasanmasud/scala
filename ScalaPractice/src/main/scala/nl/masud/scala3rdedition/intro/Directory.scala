package nl.masud.scala3rdedition.intro

class Directory {
  var telePhoneDirectory = scala.collection.mutable.Map(
    "masud" -> "not known",
    "vikas" -> "0683208392",
    "ali" -> "0683208391"
  )

  def update(name: String, number: String) = {
    println("using the = operator")
    this.telePhoneDirectory(name) = number
  }

  def update(newNumber: String): Unit = {

    this.telePhoneDirectory.foreach(p => {
      if (p._2.startsWith("06")) {
        this.telePhoneDirectory(p._1) = newNumber
      }
    })
  }

  def apply(name: String): String = {
    print("retrieving the value")
    this.telePhoneDirectory(name)
  }

  override def toString: String = {
    this.telePhoneDirectory.mkString(",")
  }

}

object Directory {

  def main(args: Array[String]): Unit = {
    val teleDirectory = new Directory
    teleDirectory() = "123"
    print(teleDirectory.toString)
  }

}