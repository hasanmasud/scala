package nl.masud.scala3rdedition.intro

/**
  * @author mhasan
  */
object ScalaPractice {


  def main(args: Array[String]): Unit = {

    //        var couter1 = new Counter(5)
    //        println(couter1.getCount)
    //        var couter2 = new Counter(0)
    //        println(couter2.getCount)
    //        Logger.log()


//    for (
//      i <- 0 to 5;
//      j <- 0 to 5;
//    ) yield {
//
//     println(j, j)
//    }


    (0 to 5).flatMap {
      i =>
        (0 to 5).map {
          j => println(i, j)
        }
    }

  }


}
