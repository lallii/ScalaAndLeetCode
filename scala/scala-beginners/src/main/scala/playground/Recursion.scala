package playground

object Recursion extends App{
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }
  println(factorial(5))

  def anotherFactorial(n:Int,accumulator:BigInt) :BigInt={
     if(n<=1) accumulator
     else anotherFactorial(n-1,n*accumulator)
  }
  println(anotherFactorial(5000,1))

  var result=99.isInstanceOf[Int]
  println(result)

  lazy val emp="hi"
  println(emp)
}
