package fp

object MapFlatmapFilterFor extends App{

    val list = List(1,2,3)
    println(list.head)
    println(list.tail)
    println(list.map(_+1))
    println(list.map(_+" is a number"))
    println(list.filter(_%2==0))
    val toPair = (x:Int) => List(x,x+1)
    println(list.flatMap(toPair))

    val numbers = List(1,2,3,4)
    val chars = List('a','b','c','d')
    //List("a1","a2"-----,"d4")

    val combinations = numbers.flatMap(n => chars.map(c => ""+c+n))
    println(combinations)

    val colors = List("black","white")
    val combination = numbers.flatMap(n=> chars.flatMap(c => colors.map(color => ""+c+n+"-"+color)))
    println(combination)

    list.foreach(println)

    val forCombinations = for{
       n <- numbers
       c <- chars
       color <- colors
    } yield ""+c+n+"-"+color
    println(forCombinations)

    for{
       n <- numbers
    }println(n)

}
