package Demo

object OptionType {
  val ls = List(1, 2, 3)
  val map : Map[Int, String] = Map(801 -> "max", 802 -> "Tom", 803 -> "July")
  val opt : Option[Int] = None

  def main(args: Array[String]): Unit = {
    println(ls.find(_ >= 3)) // prints 'some(3)'
    println(ls.find(_ >= 3).get) // prints 3
    println(map.get(801))
    println(map(801))
    println(map.get(807).getOrElse("No name found"))

    println(opt.isEmpty)
  }

}
