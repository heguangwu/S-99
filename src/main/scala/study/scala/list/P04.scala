package study.scala.list

/**
  * Created by heguangwu on 5/24/17.
  */
object P04 {
  def length_1[A](ls: List[A]): Int = ls.foldRight(0) {
    (_, b) => b + 1
  }
  def length_2[A](ls: List[A]): Int = ls.map{ _ => 1}.reduce{ _ + _ }
}
