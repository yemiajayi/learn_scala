package Demo

object ForLoop {
  def main(args: Array[String]): Unit = {

    // range 1 to 10
    for (x <- 1 to 10) {
      println(s"x is $x")
    }
    println("")

    // range 1 until 6
    for (y <- 1 until 6) {
      println(s"y until $y")
    }
    println("")

    // multiple ranges
    for (a <- 1 to 3; b <- 1 to 3) {
      println(s"y to $a $b")
    }
    println("")

    // using list
    val l = List(1, 2, 3, 4, 5)

    for (i <- l) {
      println(s"i is $i")
    }
    println("")

    // filter values
    for (i <- l; if i > 3) {
      println(s"i is $i")
    }
    println("")

    val res = for {i <- l; if i > 3}
      yield {i * i}

    println(res)
  }
}
