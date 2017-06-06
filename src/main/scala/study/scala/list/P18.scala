package study.scala.list

/**
  * Created by heguangwu on 5/24/17.
  */
object P18 {
  def slice[A](start: Int, end: Int, ls: List[A]): List[A] =
    ls.zipWithIndex.filter { v => v._2 >= start && v._2 < end }.map { _._1 }
}
