package com.comprakash.algorithms
package arrays

object Anagram extends App{
  def check_if_anagram_using_sort(input1: String, input2: String): Boolean = {
    val cleanedInput1 = ("[a-z0-9]+".r findAllIn input1.toLowerCase()).mkString
    val cleanedInput2 = input2.toLowerCase().filter(c => c.isLetter || c.isDigit)
    cleanedInput1.sorted == cleanedInput2.sorted
  }

  def check_if_anagram(input1: String, input2: String): Boolean = {
    val cleanedInput1 = input1.toLowerCase().filter(c => c.isLetter || c.isDigit)
    val cleanedInput2 = input2.toLowerCase().filter(c => c.isLetter || c.isDigit)
    val letterCount = collection.mutable.Map[Char, Int]().withDefaultValue(0)
    if (cleanedInput1.length == cleanedInput2.length) {
      for (letter <- cleanedInput1) {
        letterCount(letter) += 1
      }
      for (letter <- cleanedInput2) {
        letterCount(letter) -= 1
      }
      if (letterCount.exists(x => x._2 != 0)) false else true
    } else false
  }
}
