package com.knoldus

case class Num(number: String, isEven: Boolean)

object Num extends App {

  val listOfCaseClass: List[Num] = List(Num("1",false),Num("2",true), Num("3",false),
                                    Num("4",true), Num("5",false))
  val listOfIntegers = List(1,2,3,4,5)
  println(listOfIntegers.filter(intValue => intValue % 2 == 0))
  println(listOfIntegers.filterNot(intValue => intValue % 2 == 0))

  println(listOfCaseClass.filter(nums => nums.isEven))
  println(listOfCaseClass.filterNot(nums => nums.isEven))

}
