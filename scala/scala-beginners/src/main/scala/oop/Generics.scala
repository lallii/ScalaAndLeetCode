package oop
object Generics extends App{
   class MyList[+A]
   {

   }
   val listOfIntegers = new MyList[Int]
   val listOFStrings = new MyList[String]

//  class Animals[-A]
//  {
//     def animal :Animal= new Dog
//  }
//  val dog = new Dog
//  val Animals: Animals[Animal]  = new Animals[Animal]
//  val animalAnimals : Animals[Dog] = Animals

  class Animal {
    def print: Unit = println("In Animal Parent class")
  }

  class Dog extends Animal {
    override def print: Unit = println("In Dog Child class")
  }

  class Cat extends Animal {
    override def print: Unit = println("In Cat Child class")
  }
   class Animals[A <: Animal](animal: A)
   {
      def printing: Unit = animal.print
   }
   class Car
   val animals= new Animals(new Dog)
   animals.printing

}
