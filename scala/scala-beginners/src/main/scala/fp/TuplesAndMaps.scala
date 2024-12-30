package fp

object TuplesAndMaps extends App{

      val aTuple = (2,"hello-world")
      println(aTuple._1)
      println(aTuple.copy(_2="good bye"))
      println(aTuple.swap)
      val aMap : Map[String,Int]= Map()
      val phonebook = Map(("jim",555),"John" -> 666).withDefaultValue(-1)
      println(phonebook)
      println(phonebook.contains("Jim"))
      println(phonebook("abc")) //exception if we don't use withDefaultValue
      println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))
      println(phonebook.view.filterKeys(x => x.startsWith("J")).toMap)
      println(phonebook.view.mapValues(number => number*10).toMap)

      val names= List("Bob","Bobby","Jim","Angela","John")
      println(names.groupBy(name => name.charAt(0)))

}
