package oop

object AnonymousClasses extends App{
     abstract class Animal {
       def eat: Unit= println("Animal is eating")
     }
     val anonymousAnimal = new Animal{
       override def eat : Unit = println("eating and creating anonymous classes")
     }
  anonymousAnimal.eat
  class Person(val name: String)
  {
    def print: Unit= println(s"${name}")
  }
  val person1 = new Person("jim"){
     override def print: Unit = println(s"hiii ${name}")
  }
  person1.print
}
