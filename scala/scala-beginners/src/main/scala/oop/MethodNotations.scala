package oop

import scala.language.postfixOps
object MethodNotations extends App{
  class Person(val name:String, favoriteMovie :String)
  {
    def likes(movie:String): Boolean=movie==favoriteMovie
    //def +(person: Person): String =s"${this.name}"+" "+s"${person.name}"
    def unary_! : String =s"hi!  $name This is prefix notation"
    def postFix : String = "This is postfix notation"
    def apply() : String ="This is apply method"
  }
  val mary=new Person("Mary","Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //infix notation or operator notation
  val person=new Person("john","Inception")
  //println(mary + person)
  println(!mary)
  println(mary postFix)
  println(mary())
}
