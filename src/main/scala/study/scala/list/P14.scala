package study.scala.list

/**
  * Created by heguangwu on 5/24/17.
  */
object P14 {
  def duplicate_1[A](ls: List[A]): List[A] = ls.foldRight(List[A]()) { (a, b) => a :: a :: b }
}
