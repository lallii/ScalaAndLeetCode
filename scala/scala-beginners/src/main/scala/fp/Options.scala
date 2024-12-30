package fp

object Options extends App{

     val myFirstOption : Option[Int] = Some(4)
     val noOption : Option[Int] = None
     println(myFirstOption)
     def unSafeMethod() : String = null
     val result = Option(unSafeMethod())
     println(result)

     //chained methods
     def backUpMethod() : String  ="A valid result"
     val chainedResult = Option(unSafeMethod()).orElse(Option(backUpMethod()))
     println(chainedResult)
     val chainresult = myFirstOption orElse noOption
     println(chainresult)
     println(myFirstOption.isEmpty)


}
