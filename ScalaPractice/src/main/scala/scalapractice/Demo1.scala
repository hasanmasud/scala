package scalapractice

object Demo1 {

  def main(args: Array[String]): Unit = {

    val com = new Complex()


  }

  def oncePerSecon(callback: () => Unit) {
    while (true) {
      callback
      Thread sleep 1000
    }
  }

  def printSomething(): Unit = {
    println("this is to print")
  }


  class Complex {
    private var real = 0
    private var imaginary = 0

    def re() = real

    def im() = imaginary
  }


}
