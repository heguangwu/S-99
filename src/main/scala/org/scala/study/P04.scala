package org.scala.study

/**
  * Created by heguangwu on 5/24/17.
  */
object P04 {
  def length_1[A](ls: List[A]): Int = ls.foldRight(0) {
    (_, b) => b + 1
  }
  def length_2[A](ls: List[A]): Int = ls.map{ _ => 1}.reduce{ _ + _ }

  def main(args: Array[String]): Unit = {
    println(length_1(List(1, 1, 2, 3, 5, 8)))
    println(length_2(List(1, 1, 2, 3, 5, 8)))
  }
}
