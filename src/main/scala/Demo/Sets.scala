package Demo

object Sets {

  val my_set: Set[Int] = Set(1, 2, 2, 3, 4, 5)
  val my_set2: Set[Int] = Set(70, 2, 4, 50)

  def main(args: Array[String]): Unit = {

    for (x <- my_set) {
      println(x)
    }
    println()

    for (x <- my_set2) {
      println(x)
    }

    println(my_set2 + 10)
    println(1 :: 5 :: 9 :: Nil) // append values to an empty list
    println(my_set2.isEmpty)
    println(my_set2.head)
    println(my_set2.tail)
    println(my_set ++ my_set2)
    println(my_set.&(my_set2))

    my_set.foreach(println)

    var sum : Int = 0
    my_set.foreach(sum += _)
    println(sum)

  }

}
