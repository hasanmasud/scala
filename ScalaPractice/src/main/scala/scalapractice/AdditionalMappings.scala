package scalapractice

import scala.collection.concurrent.TrieMap

class AdditionalMappings() {
  var x = "";
  var maps: Array[AdditionalMapping] = Array[AdditionalMapping]()
}


class AdditionalMapping {
  var y = ""
}


object AdditionalMappings {

  private val items = TrieMap.empty[String, AdditionalMappings]

  def getData(filePath: String): Array[AdditionalMapping] = {
    items.getOrElseUpdate(filePath, populateData()).maps
  }

  private def populateData(): AdditionalMappings = {
    val mapping = new AdditionalMappings
    mapping.x = "masud"
    mapping.maps = List(new AdditionalMapping, new AdditionalMapping).toArray
    mapping
  }

}