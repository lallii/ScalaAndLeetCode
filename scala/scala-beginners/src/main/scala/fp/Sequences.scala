package fp

object Sequences extends App{

    val aSequence = Seq(1,4,3,2)
    println(aSequence)
    println(aSequence.reverse)
    println(aSequence(2))
    println(aSequence ++ Seq(7,5,6))
    println(aSequence.sorted)

    val aRange : Seq[Int] = 1 until 10
    //aRange.foreach(println)

    val aList = List(1,2,3)
    val prepended = 42 +: aList :+ 89
    println(prepended)

    val apples5 = List.fill(5)("apple")
    println(apples5)
    println(apples5.mkString("-"))

    val numbers = Array(1,2,3,4)
    val threeElements = Array.ofDim[String](3)
    threeElements.foreach(println)

    numbers(2)=0
    println(numbers.mkString(" "))

    //array can be converted to sequence implicitly

    val capacity=10
    val numberList = (1 to capacity).toList
    println(numberList)
}
