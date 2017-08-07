package io.glassdome.translate

import org.specs2.mutable._
import org.specs2.specification._


class LeetTranslatorSpec extends Specification {

  "translate" should {

    "convert a string based original map" >> {
      val a = "socks, shoes, and shirts"
      val b = "$0ck$, $#03$, 4nd $#!r7$"

      LeetTranslator.translate(a) === b
    }

    "conver a string based on a modified orginal map" >> {

      val a = "socks, shoes, and shirts"
      val b = "?0ck?, ?#03?, *nd ?#!r7?"

      LeetTranslator.translate(a, Map("a" -> "*", "s"->"?")) === b

    }
  }
  
  
}