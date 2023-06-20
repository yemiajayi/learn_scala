package Demo

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val name = "mark"
    val age = 20
    println(name + " is " + age + " years old")
    println(s"$name is $age years old")
    println(f"$name%s is $age%d years old")
  }
}

//@main def HelloWorld(args: String*): Unit =
//  println("Hello, World!")
