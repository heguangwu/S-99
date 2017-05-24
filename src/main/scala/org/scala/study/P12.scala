package org.scala.study

import scala.annotation.tailrec

/**
  * Created by heguangwu on 5/24/17.
  */
object P12 {
  @tailrec
  def loop[A](res:List[A], n:Int, v:A) : List[A] =
    if(n > 0) loop(v::res, n - 1, v)
    else res

  def decode_1[A](ls:List[(Int, A)]) : List[A] = ls flatMap { v => loop(Nil, v._1, v._2)}
  def decode_2[A](ls:List[(Int, A)]) : List[A] = ls.foldRight(List[A]()) {(a,b) => loop(b,a._1, a._2)}

  def main(args: Array[String]): Unit = {
    println(decode_1(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
    println(decode_2(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  }
}
