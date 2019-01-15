package app
import scala.io.StdIn

object GreeterApplication extends App {

  val randomname = StdIn.readLine("What  is your name? \n")

  val person : Person  = new Person( randomname)
  val person2 : Person  = new Person("muhammad")

  println(person.speak())
}



