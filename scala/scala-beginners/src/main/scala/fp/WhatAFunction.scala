package fp

object WhatAFunction extends App{

   val doubler = new MyFunction[Int,Int]{
       override def apply(element: Int): Int = element *2
   }
   println(doubler(2))
   //function types = Function1[A,B]
   val stringToIntConverter = new Function1[String,Int]{
     override def apply(string: String) :Int = string.toInt
   }
   println(stringToIntConverter("2")+5)


   val adder : (Int,Int) => Int = new Function2[Int,Int,Int]{
     override def apply(a:Int, b:Int) :Int = a+b
   }
   println(adder(2,4))

   val superAdder = new Function1[Int, Function1[Int,Int]]{
      override def apply(x:Int) : Function1[Int,Int]= new Function1[Int,Int]{
         override def apply(y:Int): Int= x+y
      }
   }
   println(superAdder(4)(5)) //curried functions
}
trait MyFunction[A,B] {
  def apply(element: A): B
}