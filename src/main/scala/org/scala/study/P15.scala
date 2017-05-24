package org.scala.study

import scala.annotation.tailrec

/**
  * Created by heguangwu on 5/24/17.
  */
object P15 {
  @tailrec
  def loop[A](res: List[A], n: Int, v: A): List[A] = if (n > 0) loop(v :: res, n - 1, v) else res

  def duplicateN[A](n: Int, ls: List[A]): List[A] = ls.foldRight(List[A]()) { (a, b) => loop(b, n, a) }

  def main(args: Array[String]): Unit = {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }
}
