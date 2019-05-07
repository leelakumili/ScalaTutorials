package com.scala.basic.examples.number
import com.scala.basic.examples.string.StringUtils._
object NumbersExample {

  def main(args: Array[String]): Unit = {

    println("100".toInt)
    println("100".toDouble)
    println("100".toLong)
    println("100".toIntFromS)
    println("a".toIntFromS)
   // println("a".toInt)
   // println("a".toInt)

    val r = scala.util.Random

    println(r.nextInt(10))
    println(r.nextInt(10))
    println(r.nextInt(10))

    println(for(i <- 0 to r.nextInt(10)) yield i*2)
    println(for(i <- 0 to 10) yield i*2)

    println(for(i <- 0 to 10 by 5) yield i*2)
    val v = (1 to 10 by 2).toList.foreach(print)
    //println(v)
  }


}
