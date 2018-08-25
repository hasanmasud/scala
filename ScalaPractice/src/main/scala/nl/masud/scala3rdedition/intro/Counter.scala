package nl.masud.scala3rdedition.intro

class Counter(x: Int) {

  private var count = x;

  def increment = count += 1;

  def getCount = count

  def this() {
    this(0)
  }

}
