package Demo

// map is like dict in python
object Maps {

  val my_map : Map[Int, String] = Map(801 -> "max", 802 -> "Tom", 803 -> "July")

  def main(args: Array[String]): Unit = {
    println(my_map)
    println(my_map(801))
    println(my_map.keys)
    println(my_map.values)
    println(my_map.isEmpty)

    for (x <- my_map.values) {
      println(x)
    }

    my_map.keys.foreach { key =>
      println(s"key: $key, value: " + my_map(key))
      // println()
    }
  }

}
