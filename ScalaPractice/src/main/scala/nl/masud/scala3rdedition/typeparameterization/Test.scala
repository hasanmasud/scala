package nl.masud.scala3rdedition.typeparameterization

import scala.collection.immutable.Queue

/**
  * @author mhasan
  */
object Test {


  def main(args: Array[String]): Unit = {

    val q = Queue(1,2,3)
    val q1 = q enqueue(4)

    print(q1.tail)


  }

}
