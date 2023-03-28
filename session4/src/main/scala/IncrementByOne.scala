package com.knoldus

import scala.io.StdIn

class IncrementByOne {
   private def incrementInteger(value: Int): Int = {
    value + 1
  }
}

object IncrementByOne extends App {
  private val incrementObject = new IncrementByOne
  println("Enter a number")
  private val userInput = StdIn.readInt()
  private val incrementedValue = incrementObject.incrementInteger(userInput)
  println(incrementedValue)
}
