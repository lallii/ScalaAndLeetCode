package playground

object ValuesVariablesTypes extends App{
      val x:Int=42
      //x=42
      println(x)
      var y : Int=32
      y=33
      println(y)
      var empName : String ="lalitha"
      println(empName.take(4))

      val name="david"
      val age=25
      val greeting= s"hello my name is $name and I am ${age+1} years old"
      println(greeting)

      val speed=1.2f
      val myth=f"$name can eat $speed%2.2f burgers per min"
      println(myth)

      println(raw"This is a \n newline")
      val escaped = "This is a \n newline"
      println(raw"$escaped")

}
