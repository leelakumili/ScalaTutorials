package com.scala.basic.examples.list

object ListExample {

  def main(args: Array[String]): Unit = {
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("First element: " + list.head)
    println("Last element of list: " + list.last)

    println("2nd element from beigining: " + list(1))
    println("Last but one element:" + list(list.size - 2))
    println("Get 2nd element from end: "+getKthElement(list,2))
    println("Get 5th element from end: "+getKthElement(list,5))
    println("Reverse list: "+list.reverse)
    println("is list palindrome : "+isPalindrome(list))
    println("is list palindrome : "+isPalindrome(List(1,2,1)))
    println("Remove duplicates using distinct: "+List(1,2,1).distinct)
    println("Remove duplicate by converting to set and back to list : "+List(1,2,1).toSet.toList)
    println("Remove duplicate using distinct method(foldleft) : "+ distinct(List(1,2,1)))

    def getKthElement(list: List[Int] ,k : Int ): Int={

      list((list.size-k))
    }

    def isPalindrome(list:List[Int]) :Boolean={
       list == list.reverse
    }

    def distinct[A](list:List[A]):List[A] =
      list.foldLeft(List[A]()) {
        case (acc, item) if acc.contains(item) => acc
        case (acc, item) => item::acc
      }
  }
}
