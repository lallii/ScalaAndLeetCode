package playground

object Expressions extends App{
     var aCondition=true
     var aConditionValue = if(aCondition) 5 else 3
     println(aConditionValue)

     var x=3
     var aValue = (x=3)
     println(aValue);

     val codeBlock = {
       val y=2
       val z=y+1
       if(z>2) "hello" else "goodbye"
       if(z==3) 42 else 5
       10
     }
     println(codeBlock)


}
