object LoopsExample {
def main(args:Array[String]): Unit ={

  println("while loop")
  var i=0
   while(i<=10){
     println(i)
     i+=1
   }
  println("for loop")

  for(i <- 10 to 15){
    println(i)

  }
  println("iterating integer list")
var aList = List(1,2,3,4,5)

  for(i <- aList){
    println(i)
  }

  println("iterating string list")
  var stringList = List("a","b","c","d","e")
  for(i <- stringList){
    println(i)
  }

  for(i <- 0 to 5 ; j <- 1 to 5){
    println ( i , j)
  }
}

}
