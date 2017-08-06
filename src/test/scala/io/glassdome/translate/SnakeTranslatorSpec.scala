package io.glassdome.translate

import org.specs2.mutable._
import org.specs2.specification._


class SnakeTranslatorSpec extends Specification {
  
  "translate" should {
    
    "convert a lower camel case string to snake_case" >> {
      val a = "thisIsLowerCamelCase"
      val b = "this_is_lower_camel_case"
      
      SnakeTranslator.translate(a) === b
    }
    
    "ignore a starting capital letter" >> {
      /*
       * Implement this functionality.
       */
      pending
    }
  }
  
  
}