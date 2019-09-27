package com.ddlab.scala.strings

object StringSInterpolator1 {
  def main(args: Array[String]): Unit = {
    val name: String = "James Cook";
    println(s"Hello $name");
    val str1 = s"Hello $name";//You can assign to a variable also
    println("New String : "+str1)
    println(s"1 + 1 = ${1 + 1}");
  }

}
