package Demo

object Currying {
  def add(x: Int, y: Int) = x + y

  def add2(x: Int) = (y: Int) => x + y

  def main(args: Array[String]): Unit = {
    println(add(20, 10))

    println(add2(20)(30))
  }

}
