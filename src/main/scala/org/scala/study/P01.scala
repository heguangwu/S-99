package org.scala.study

import scala.annotation.tailrec

/**
  * Created by heguangwu on 5/24/17.
  */
object P01 {
  @tailrec
  def last_1[A](ls: List[A]): A = ls match {
    case tail::Nil => tail
    case _::tail => last_1(tail)
    case _ => throw new NoSuchElementException
  }

  def last_2[A](ls: List[A]): A = ls.foldLeft(null.asInstanceOf[A]) {
    (b, a) => a match {
      case Nil => b
      case _ => a
    }
  }
  def last_3[A](ls: List[A]): A = ls.foldRight(null.asInstanceOf[A]) {
    (a, b) => if (b == null) a else b
  }

  def main(args: Array[String]): Unit = {
    println(last_1(List(1, 1, 2, 3, 5, 8)))
    println(last_2(List(1, 1, 2, 3, 5, 8)))
    println(last_3(List(1, 1, 2, 3, 5, 8)))
  }
}
