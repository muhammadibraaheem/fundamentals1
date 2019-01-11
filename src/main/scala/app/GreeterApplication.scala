package app
import scala.io.StdIn

object GreeterApplication extends App {

  val name1 = StdIn.readLine("What  is your name? \n")

  greet(name1)

  def greet(name: String): Unit = {
    println(s"Hi $name")
  }
}



