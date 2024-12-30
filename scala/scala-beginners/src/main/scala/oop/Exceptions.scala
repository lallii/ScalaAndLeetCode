package oop

object Exceptions extends App{
   val x: String= null
  // val wierdValue = throw new NullPointerException

   def getInt(withException : Boolean) : Int ={
      if(withException) throw new RuntimeException
      else 42
   }
    val potentialFail = try{
     getInt(true)
   }
   catch{
      case e: RuntimeException => 43
   }
   finally{
        println("finally")
   }
    println(potentialFail)
   class MyException extends Exception
   val exception = new MyException
   

}
