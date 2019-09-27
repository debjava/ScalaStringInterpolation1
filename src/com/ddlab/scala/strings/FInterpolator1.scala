package com.ddlab.scala.strings

object FInterpolator1 {
  def main(args: Array[String]): Unit = {
    val height = 1.9d;
    val name = "James";
    var str1: String = f"$name%s is $height%2.2f meters tall";
    println(str1); //James is 1.90 meters tall
  }
}
