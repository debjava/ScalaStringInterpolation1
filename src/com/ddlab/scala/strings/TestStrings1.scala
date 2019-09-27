package com.ddlab.scala.strings

object TestStrings1 {
  def main(args: Array[String]): Unit = {
    var floatVal: Float = 12.345F;
    var intVal: Int = 123;
    var strVal: String = "Hello James";

    val str1 = printf("The value of the float variable is "
      + "%f, while the value of the integer "
      + "variable is %d, and the string " + "is %s", floatVal, intVal, strVal);
    println("Value of String : " + str1);
  }
}
