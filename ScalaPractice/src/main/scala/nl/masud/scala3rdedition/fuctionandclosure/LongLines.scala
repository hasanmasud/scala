package nl.masud.scala3rdedition.fuctionandclosure

object LongLines {

  def main(args: Array[String]) {

    printMe();

  }

  def printMe() = {


    printThis

    def printThis = {
      println("I am a local function")
    }


    printThis

  }

}