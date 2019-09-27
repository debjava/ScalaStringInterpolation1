package com.ddlab.scala.strings

object RawInterpolator1 {
  def main(arg: Array[String]): Unit = {
    var s1: String = s"abcd \n pqrs \n asdf";
    var s2: String = raw"a\n b\n c \n d";
    println("Formatted Result : " + s1);
    println("Raw Result : " + s2);
  }
}
