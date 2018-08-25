package nl.masud.scala3rdedition.intro

/**
  * @author mhasan
  */
object ScalaPractice1 {


  def main(args: Array[String]) {

    var i = 0;
    while (i <= 20) {
      println(i)
      i = i + 1
    }

    do {
      println(i)
      i = i - 1

    } while (i > 0)


    for (i <- 0 to 100) {
      print(i)
    }


    i = 0;
    val randomLetter = "ASKAJKGDLADADGKADJADGADAD"
    for (i <- 0 until randomLetter.length) {
      println(randomLetter(i))
    }

    val aList = List(1, 2, 3, 4, 5)
    for (a <- aList) {
      println(a)
    }


    var evenList = for {i <- 0 to 20
                        if (i % 2) == 0
    } yield i

    for(e <- evenList){
      println("even : " + e)
    }


    for(i <- 1 to 5 ; j <- 1 to 5){
      println("i : " + i + ", j : " + j)
    }


  }

}
