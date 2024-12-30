package oop
object AbstractDataTypes extends App{
    abstract class Animal {
      val creatureType: String="animal"
      def eat: Unit
    }
    class Dog extends Animal{
       override val creatureType : String="Dog"
       def eat : Unit= println("override keyword is optional for the implementation of abstract class")
    }
    trait Carnivore {
      def eat(animal:Animal) : Unit
    }
    class Crocodile extends Animal with Carnivore{
      override val creatureType="croc"
      def eat : Unit=println("nomnom")
      def eat(animal:Animal) : Unit=println(s"${animal.creatureType}")
    }
    val croc = new Crocodile
    val dog = new Dog
    croc eat dog
}
