package io.glassdome.translate

object LeetTranslator extends Translator {

  private val standardMapping = Map(
    'A' -> '4',
    'E' -> '3',
    'T' -> '7',
    'O' -> '0',
    'I' -> '!',
    'S' -> '$',
    'H' -> '#')

  def translate(s: String, mapping: Map[String, String] = Map()) = {
    val m = mapping map { case (k, v) => (k.head.toUpper -> v.head) }
    toLeet(s, m)
  }


  private[translate] def charReplacer(s: String, charMap: Map[Char, Char]): String =
    s.map(c => charMap.get(c.toUpper).fold(c)(x => x)).toString

  private[translate] def toLeet(s: String, customMap: Map[Char, Char] = Map.empty): String =
    charReplacer(s, standardMapping ++ customMap)
}