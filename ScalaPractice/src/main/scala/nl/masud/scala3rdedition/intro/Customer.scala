package nl.masud.scala3rdedition.intro

class Customer(var name: String, var address: String)

object Customer {

  def main(args: String*): Unit = {
    val c = Customer.createCustomer("Masud Hasan", "Amsterdam")


  }

  def createCustomer(name: String, address: String) = new Customer(name, address)


}


