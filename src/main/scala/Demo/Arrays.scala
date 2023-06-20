package Demo

object Arrays {

  val my_array: Array[Int] = new Array[Int](4)
  val my_array2 = Array[Int](1, 2, 3, 4, 5)

  def main(args: Array[String]): Unit = {

    my_array(0) = 20
    my_array(1) = 30
    my_array(2) = 40
    my_array(3) = 50
    //println(my_array)

    for (x <- my_array) {
      println(x)
    }

    for (i <- 0 to (my_array.length - 2)) {
      println(my_array(i))
    }

    val result = my_array.concat(my_array2)
    println(my_array2.length)
    println(result)
  }

}
