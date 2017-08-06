package io.glassdome.translate


/**
 * Translate lowerCamelCase to snake_case
 */
object SnakeTranslator extends Translator {
  
  def translate(s: String): String = {
     s.foldLeft(""){ (acc, c) => if (c.isLower) acc + c else acc + s"_${c.toLower}" }
  }
  
}