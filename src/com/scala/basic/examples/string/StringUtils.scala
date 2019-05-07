package com.scala.basic.examples.string

object StringUtils {
 implicit class StringImprovements(val s:String){

   def isPrefix = s.startsWith("STAR")

   def toIntFromS = {
     try{
       Some(s.toInt)
     }catch{
       case e: NumberFormatException => 0
     }
   }
 }
}
