package study.scala.list

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

  def penultimate_3[A](ls: List[A]): A = {
    @tailrec
    def truncate(n:Int, a:List[A]): A = (n, a) match {
      case (0, h::_) => h
      case (_, _::t) => truncate(n - 1,t)
      case (_, Nil)  => throw new NoSuchElementException
    }
    truncate(1,ls.reverse)
  }
}
