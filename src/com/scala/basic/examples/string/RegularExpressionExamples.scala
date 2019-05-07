package com.scala.basic.examples.string

import com.scala.basic.examples.string.StringUtils._
object RegularExpressionExamples {

  case class RequestValues(name: String, dept: String)

  def extractEmployeeAttributes(data: String): Option[RequestValues] = {
    val r = "([A-Za-z]+) ([A-Za-z]{2})".r

    data match {
      case r(name,dept) =>
        Some (RequestValues(name,dept))
      case _ => None
    }
  }
  def main(args: Array[String]): Unit = {
     val pattern = "[0-9]*".r
     val string = "201 Utah S ave , 95035"

    pattern.findFirstMatchIn(string).foreach(println(_))
    pattern.findAllIn(string).foreach(println(_))
    println("get or else example"+pattern.findFirstMatchIn("122 california circle").getOrElse("No match found"))
    println("get or else example with no match"+pattern.findFirstMatchIn("california circle").getOrElse("No match found"))

    println("replace all example ")
    string.replaceAll("[0-9]","#").foreach(print)
    println("\n replace all example using regex"); "[0-9]".r.replaceAllIn(string,"x").foreach(print)
    println(extractEmployeeAttributes("Leela IT").get.name)

    //Own String methods
    println("STARAvenue".isPrefix)
    println("STAvenue".isPrefix)

}}
