package nl.masud.scala3rdedition.intro

class Person(initial: String = "", firstName: String, lastName: String = "") {

  var fullName = String.format("%s %s %s", initial, firstName, lastName)

  def this(firstName: String, lastName: String) {
    this("", firstName, lastName)
  }

  def this(firstName: String) {
    this("", firstName,"")
  }


  def this() {
    this("", "", "")
  }

}
