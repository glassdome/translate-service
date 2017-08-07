package io.glassdome.translate


/**
 * Translate lowerCamelCase to snake_case
 */
object SnakeTranslator extends Translator {

  def translate(s: String, mapping: Map[String, String] = Map()): String = {
    val result = s.foldLeft("") { (acc, c) =>
      if (c.isLower) acc + c else acc + s"_${c.toLower}"
    }

    //drops '_' that was created  if the first letter was upper case
    if (result.charAt(0) == '_') result.drop(1)
    else result
  }


}

