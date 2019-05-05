package com.scala.basic.examples.recursive

object Factorial {

  def main(args: Array[String]): Unit = {

    def factorial(num: Int) : Int ={
      if(num ==1)
          1
      else
        num * factorial(num-1)
    }

    print("factorial 4:"+ factorial(4))
  }
}
