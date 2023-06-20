package Demo

object DoWhile {
  def main(args: Array[String]): Unit = {

    var y = 0

    // do while loop returns the do block even if while condition is false
    do {
      println(s"y = $y")
      y += 1
    }
    while (y < 10)
  }
}

