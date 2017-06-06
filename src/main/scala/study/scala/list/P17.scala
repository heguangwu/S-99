package study.scala.list

/**
  * Created by heguangwu on 5/24/17.
  */
object P17 {

  def split[A](n:Int, ls:List[A]):(List[A], List[A]) = ls.foldRight( (List[A](),List[A]()) ) {
    (a,b) => if(b._2.size != ls.size - n) (b._1, a::b._2) else (a::b._1, b._2)
  }
}
