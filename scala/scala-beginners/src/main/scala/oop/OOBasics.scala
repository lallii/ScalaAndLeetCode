package oop

//object OOBasics extends App{
//    val person=new Person("john",26)
//    println(person.x)
//    person.greet("lalitha")
//}
//class Person(name:String,val age:Int) //constructor
//{
//    val x=2
//    println(1+3)
//
//    //method
//    def greet(name:String): Unit=println(s"${this.name} says Hi, $name")
//}

object OOBasics extends App {
    val person = new Person("john", 26)
    val person1= new Person("ram")
    val person2= new Person()
    println(person.age)
    println(person1.name)
    println(person2.name)
}
class Person(val name:String="",val age:Int=0) {

}