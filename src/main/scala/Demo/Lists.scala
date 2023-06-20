package Demo

object Lists {

  val my_list: List[Int] = List(1, 2, 3, 4, 5)
  val names: List[String] = List("Tom", "Rob", "Kent")

  def main(args: Array[String]): Unit = {

    for (x <- my_list) {
      println(x)
    }
    println()

    for (x <- names) {
      println(x)
    }

    println(50 :: my_list)
    println("james" :: names)
    println(1 :: 5 :: 9 :: Nil) // append values to an empty list
    println(names.isEmpty)
    println(names.head)
    println(names.tail)
    println(names.reverse)
    println(List.fill(6)("Yes"))

    my_list.foreach(println)

    var sum : Int = 0
    my_list.foreach(sum += _)
    println(sum)

  }

}
