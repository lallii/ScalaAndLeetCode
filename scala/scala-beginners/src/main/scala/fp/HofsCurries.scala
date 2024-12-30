package fp

object HofsCurries extends App{

      //function that applies a function n times over a value x
      // nTimes(f,3,x) = f(f(f(x)))
      def nTimes(f : Int => Int, n:Int , x:Int) :Int =
        {
            if(n<=0) x
            else nTimes(f,n-1,f(x))
        }
     val plusOne = (x: Int) => x+1
     println(nTimes(plusOne, 10, 1))
     def nTimesBetter(f:Int => Int, n: Int) :(Int => Int) =
         {
             if(n<=0) (x:Int)=> x
             else (x:Int) => nTimesBetter(f,n-1)(f(x))
         }
     val plus = nTimesBetter(plusOne,10)
     println(plus(1))

  def curriedFunction(a: Int)(b: Int): Int = a + b
  println(curriedFunction(2)(3)) // Output: 5
  val addTwo = curriedFunction(2) // Partial application
  println(addTwo(3)) // Output: 5


}
