package com.scala.basic.examples.string

object StringExamples {

  def main(args: Array[String]): Unit = {
    val string = "Hello , world"
    println(string.getClass.getName)
    println("String length: "+ string.length)
    println("String concat: "+string +" from Leela")
    println("String to char array: "+ string.foreach(print))
    for (c <- string) print(c+",")
    println("\n Remove white space: "+ "a b c d e f".filter(_!=' '))
    val copy = "Hello , world";
    val s2 = "Hello"
    println("string are equal: "+ (string == copy))
    println("string are not equal: "+ (string != s2))

    val s = "eggs, milk, butter, Coco Puffs"
    println("split with map to transform each item in list")
    s.split(",").map(_.toUpperCase).foreach(println)

    val name = "Leela"
    val company = "Yueco"
    val years = 12
    val line = s"Hello,welcome to Scala tutorial\nby $name"
    println(s"$name works at company $company will be completing 15 yrs in next ${15-years}")
    println(raw"Hello,welcome to Scala tutorial\nby Leela")
    println(s"$line")

    val upper =   for(c <- string) yield  c.toUpper
    println("upper conversion using for and yield loop:"+ upper)

  }

}
