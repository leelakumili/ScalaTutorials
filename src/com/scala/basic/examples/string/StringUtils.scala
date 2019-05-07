package com.scala.basic.examples.string

object StringUtils {
 implicit class StringImprovements(val s:String){

   def isPrefix = s.startsWith("STAR")
 }
}
