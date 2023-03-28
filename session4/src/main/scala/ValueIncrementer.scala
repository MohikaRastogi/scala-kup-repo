package com.knoldus

import scala.io.StdIn

class ValueIncrementer {

  private def incrementIntegerValue(value: Int, valueToBeAdded: Int): Int = {
    value match {
      case someValue: Int => someValue + valueToBeAdded
      case _ => throw new IllegalArgumentException("not correct value for integer")
    }
  }
  //  private def incrementIntegerByTwo(value: Int): Int = {
  //    value match {
  //      case someValue: Int => someValue + 2
  //      case _ => throw new IllegalArgumentException("not correct value for an integer")
  //    }
  //  }
}

object ValueIncrementer extends App {
  private val valueIncrementerObject = new ValueIncrementer
  private val valueToBeIncremented = StdIn.readInt()
  private val valueToBeAdded = StdIn.readInt()
  println(valueIncrementerObject.incrementIntegerValue(valueToBeIncremented, valueToBeAdded))
}
