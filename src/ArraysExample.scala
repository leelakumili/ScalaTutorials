object ArraysExample {

  def main(args: Array[String]): Unit = {

    var intArray = new Array[Int](5);

    println("Intializaing array elements")
    for(i <- 0 to 4){
      intArray(i) =i;
      println(intArray(i))
    }

    var secondArray = new Array[Int](5)
    secondArray(0)=6
    secondArray(1)=7

    secondArray.foreach(print )

    //sort array in desc order
    intArray.sortWith(_>_).foreach(print)
    println("\n Min= "+intArray.min)
    println("\n Max= "+intArray.max)
    println("\n Sum= "+intArray.sum)
    println("\n To String= "+intArray.deep.mkString("|"))
  }
}
