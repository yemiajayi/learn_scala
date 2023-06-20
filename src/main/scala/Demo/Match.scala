package Demo

object Match {
  def main(args: Array[String]): Unit = {
    val age = 50

    age match {
      case 30 => println(age)
      case 40 => println(age)
      case 50 => println(age)
      case 60 => println(age)

      case _ => println(s"default age $age")
    }
    println("")

    val res = age match {
      case 30 => age
      case 40 => age
      case 50 => age
      case 60 => age

      case _ => println(s"default age $age")
    }
    println(s"Result = $res")
  }
}
