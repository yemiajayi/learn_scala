package Demo

object function {

  // method 1
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  // method 2
  def subtract(x: Int, y: Int): Int = {
    x - y
  }

  // method 3
  def multiply(x: Int, y: Int): Int = return x * y

  // method 4
  def divide(x: Int, y: Int) = x / y

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y
    }
    def square(x: Int) = x * x

    def **(x: Int) = x * x

    def +(x: Int, y: Int): Int = x + y
  }

  def main(args: Array[String]): Unit = {
    println(add(45, 12))
    println(subtract(45, 12))
    println(multiply(45, 12))
    println(divide(45, 12))
    println(Math.add(20, 100))
    println(Math.square(15))
    println(Math square 5)
    println(Math.**(20))
    println(Math.+(10, 7))
  }
}

