package app

class Person(name: String) {

  def speak(): String = {

    println( s"dont fall over $name")

    if (name == "me") {
      s"You dont get a hello!"
    }
    else {
      s"Hello $name"
    }
  }}

