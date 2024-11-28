package playground

object DefaultArgs extends App{

     def trFact(n:Int, acc:Int=1) :Int={
       if(n<=1) acc
       else trFact(n-1,n*acc)
     }
     println(trFact(4))

     def savePicture(format:String="jpg",width:Int=1920,height:Int=1000):Unit=println("saving picture")
     savePicture(800)
     savePicture(height=600)

}
