package scalapractice

object Demo2 {


  def main(args: Array[String]): Unit = {


    new Thread(() => {
      print
    }, "1").start()

//    new Thread(() => {
//      print
//    }, "2").start()
//
//    new Thread(() => {
//      print
//    }, "3").start()


  }


  def print(): Unit = {
    for (i <- 1 to 1) {
      var filePath = "filepath" + i;
      println("Thread  " + Thread.currentThread().getName + " "+ filePath + " -->" + AdditionalMappings.getData(filePath))
    }
  }


}
