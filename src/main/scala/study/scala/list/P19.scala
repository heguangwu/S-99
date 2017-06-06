package study.scala.list

/**
  * Created by heguangwu on 5/25/17.
  */
object P19 {
  def start_index(n:Int, len:Int) : Int = {
    if(len == 0) 0
    else if(n < 0) {
      start_index((len + n) % len, len)
    } else {
      n % len
    }
  }
  def rotate_1[A](n: Int, ls: List[A]): List[A] = {
    val num = start_index(n, ls.size)
    val res = ls.foldLeft((List[A](), List[A]())) {
      (b,a) => if(b._1.size != num) (a::b._1, b._2) else (b._1, a::b._2)
    }
    res._2.reverse ::: res._1.reverse
  }

  def rotate_2[A](n: Int, ls: List[A]): List[A] = {
    val num = start_index(n, ls.size)
    ls.drop(num) ::: ls.take(num)
  }

}
