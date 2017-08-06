package io.glassdome.translate

trait Translator {
  
  def translate(s: String, mapping: Map[String, String]): String
  
}