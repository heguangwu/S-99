package org.scala.study

import scala.annotation.tailrec

/**
  * Created by heguangwu on 5/24/17.
  */
object P02 {
  @tailrec
  def penultimate_1[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil => h
    case _ :: t => penultimate_1(t)
    case _ => throw new NoSuchElementException
  }

  def penultimate_2[A](ls: List[A]): A = ls.reverse.zipWithIndex.foldRight(null.asInstanceOf[A]) {
    (a,b) => if(a._2 == 1) a._1 else b
  }

  def main(args: Array[String]): Unit = {
    println(penultimate_1(List(1, 1, 2, 3, 5, 8)))
    println(penultimate_2(List(1, 1, 2, 3, 5, 8)))
  }
}
