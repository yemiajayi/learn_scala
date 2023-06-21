package Demo

object Tuples {
  val my_tuple = (1, 2, "hello", true)
  val my_tuple2 = new Tuple2(1, 2)
  val my_tuple3 = new Tuple3(1, 2, 3)

  def main(args: Array[String]): Unit = {
    println(my_tuple._3) // prints 'hello'
    println(my_tuple2)
    println(my_tuple3._3) // prints '3'

    my_tuple.productIterator.foreach{
      i => println(i)
    }

    println("x" -> "hello" -> true)
  }

}
