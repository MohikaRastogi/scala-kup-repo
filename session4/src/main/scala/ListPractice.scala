package com.knoldus

object ListPractice extends App {
  val list = List(2, 10, 4, 3, 5)
  val tempList = list.drop(2).dropRight(2)
  println(tempList.mkString)
}
