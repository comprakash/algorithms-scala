package com.comprakash.algorithms
package arrays

object Anagram extends App{
  def check_if_anagram(input1: String, input2: String): Boolean = {
    val cleanedInput1 = ("[a-z0-9]+".r findAllIn input1.toLowerCase()).mkString
    val cleanedInput2 = input2.toLowerCase().filter(c => c.isLetter || c.isDigit)
    cleanedInput1.sorted == cleanedInput2.sorted
  }
}
