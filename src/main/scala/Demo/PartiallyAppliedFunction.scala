package Demo

import java.util.Date

object PartiallyAppliedFunction {

  def log(date: Date, message: String) = {
    println(s"$date $message")
  }

  // partially applied function
  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(20, 30, _: Int)
    println(sum(4, 6, 9))
    println(f(15))

    val date = new Date
    val newLog = log(date, _: String)
    newLog("The message 1")
  }
}
