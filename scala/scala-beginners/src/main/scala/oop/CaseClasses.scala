package oop

object CaseClasses extends App{

   case class Person(name:String,age:Int)

   //1.class parameters are fields
   val jim=new Person("jim",34)
   println(jim.name)

   //2.toString() default implementation
   println(jim)

   //3. equals and hashcode implementation
   val jim2= new Person("jim",34)
   println(jim==jim2)

   //4.having copy method
   val jim3 = jim.copy(age=45)
   println(jim3)

   //5. having the companion objects
   val thePerson= Person
   val mary = Person("Mary",25)
   println(mary)

   //6. These are serializable and can be used in pattern object

   case object United{
      def name: String="Case objects"
   }

}
