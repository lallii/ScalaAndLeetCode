package playground

object Functions extends App{

    def aFunction(a:String, b:Int) :String={
      a+" "+b
    }
    println(aFunction("hello",3))

    def parameterLessFunction : Int =42
    println(parameterLessFunction)

    def repeatedFunction(aString :String, n:Int) :String={
      if(n==1) aString
      else aString+repeatedFunction(aString,n-1)
    }
    println(repeatedFunction("hello",3))

    def biggerFunction(n: Int): Int={
      def smallerFunction(a:Int, b:Int) : Int=a+b
      smallerFunction(n,n-1)
    }
    println(biggerFunction(3))

    def primeNumber(n:Int): Boolean={
        def isPrime(t:Int): Boolean = {
          if(t<=1) true
          else n%t!=0 && isPrime(t-1)
      }
      isPrime(n/2)
    }
    println(primeNumber(5))

   def fibonacci(n:Int): Int={
     def findFib(i:Int,last:Int,nextToLast :Int):Int={
         if(i>=n) last
         else findFib(i+1,last+nextToLast,last)
     }
     if(n<=2) 1
     else findFib(2,1,1)
   }
   println(fibonacci(8))
}
