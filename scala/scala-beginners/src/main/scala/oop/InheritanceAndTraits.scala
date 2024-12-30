package oop

object InheritanceAndTraits extends App{
  class Animal {
    val creatureType="Animal"
    protected def eat= println("animal---")
  }
  class Dog(override val creatureType: String) extends Animal{
    override def eat=println("crunch---")
  }
  val d=new Dog("Dog")
  println(d.creatureType)
  d.eat

  class Cat extends Animal{
     def crunch={
      eat
      println("cat child class for animal")
    }
  }
  val cat = new Cat
  cat.crunch

  object Person {
     val name="john"
  }
  class Person{
    val name="john"
  }
  val person1= Person
  val person2= Person
  val person3 = new Person
  val person4= new Person
  println(person3==person4)
  println(person1==person2)
  class Human(name:String,age:Int)
  class Adult(name:String,age:Int,idCard:String) extends Human(name,age)

}
