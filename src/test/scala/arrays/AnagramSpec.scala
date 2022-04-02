package com.comprakash.algorithms
package arrays

import org.scalatest.flatspec.AnyFlatSpec

class AnagramSpec extends AnyFlatSpec {
  "Two Anagram sentences" should "match" in {
    assert(Anagram.check_if_anagram("public relations", "crap built on lies!"))
    assert(Anagram.check_if_anagram("clint eastwood", "old west action"))
    assert(Anagram.check_if_anagram("Mother-in-law", "Woman Hitler"))
    assert(Anagram.check_if_anagram("Debit card", "Bad credit"))
    assert(Anagram.check_if_anagram("Election results", "Lies – let's recount"))
    assert(Anagram.check_if_anagram("A decimal point", "I'm a dot in place"))
  }

  "Two NON Anagram sentences" should "not match" in {
    assert(!Anagram.check_if_anagram("public relations", "crap built on a lies"))
    assert(!Anagram.check_if_anagram("clint eastwood", "old west action1"))
  }

  "Two Anagram sentences" should "match when using sort method" in {
    assert(Anagram.check_if_anagram_using_sort("public relations", "crap built on lies!"))
    assert(Anagram.check_if_anagram_using_sort("clint eastwood", "old west action"))
    assert(Anagram.check_if_anagram_using_sort("Mother-in-law", "Woman Hitler"))
    assert(Anagram.check_if_anagram_using_sort("Debit card", "Bad credit"))
    assert(Anagram.check_if_anagram_using_sort("Election results", "Lies – let's recount"))
    assert(Anagram.check_if_anagram_using_sort("A decimal point", "I'm a dot in place"))
  }

  "Two NON Anagram sentences" should "not match when using sort method" in {
    assert(!Anagram.check_if_anagram_using_sort("public relations", "crap built on a lies"))
    assert(!Anagram.check_if_anagram_using_sort("clint eastwood", "old west action1"))
  }
}
