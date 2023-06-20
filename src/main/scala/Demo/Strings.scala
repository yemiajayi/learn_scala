package Demo

object Strings {
  val str1: String = "Hello World"
  val str2: String = " Max"
  val numb1 = 20.4
  val numb2 = 75

  def main(args: Array[String]): Unit = {
    println(str1.length())
    println(str1.concat(str2))
    println(str1 + str2)
    println(s"$numb1 is less than $numb2")
    // d: decimal, f: float, s: string
    printf("(%d -- %f -- %s)\n", numb2, numb1, str2)
    println("(%d -- %f -- %s)".format(numb2, numb1, str2))
  }
}
