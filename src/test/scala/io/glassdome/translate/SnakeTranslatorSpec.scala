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
      //ensures that it's not converted with a leading '_' when the string starts with a capital letter

      val a = "CamelToSnakeTranslation"
      val b =  "camel_to_snake_translation"

      SnakeTranslator.translate(a) == b
    }
  }
}