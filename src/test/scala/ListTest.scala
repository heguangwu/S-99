import org.scalatest.{FunSpec, ShouldMatchers}

/**
  * Created by heguangwu on 5/25/17.
  */
class ListTest extends FunSpec with ShouldMatchers {
  describe("P1") {
    it("last test") {
      import study.scala.list.P01._
      last_1(List(1, 1, 2, 3, 5, 8)) should be(8)
      last_2(List("hello","world")) should be("world")
      last_3(List(List(1,2),List(3,4,5),List(6,7))) should be(List(6,7))
    }
  }

  describe("P2") {
    it("penultimate test") {
      import study.scala.list.P02._
      penultimate_1(List(1, 1, 2, 3, 5, 8)) should be(5)
      penultimate_2(List("hello","world")) should be("hello")
      penultimate_3(List(List(1,2),List(3,4,5),List(6,7))) should be(List(3,4,5))
    }
  }

  describe("P4") {
    it("length test") {
      import study.scala.list.P04._
      length_1(List(1, 1, 2, 3, 5, 8)) should be(6)
      length_2(List("hello","world")) should be(2)
      length_1(List(List(1,2),List(3,4,5),List(6,7))) should be(3)
      length_2(List(List(1,2),List(3,4,5),List(6,7))) should be(3)
    }
  }

  describe("P12") {
    it("decode test") {
      import study.scala.list.P12._
      decode_1(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should be(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      decode_2(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should be(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      decode_1(List((0, 'a), (1, 'b))) should be(List('b))
      decode_2(List((0, 'a), (1, 'b))) should be(List('b))
    }
  }

  describe("P14") {
    it("duplicate test") {
      import study.scala.list.P14._
      duplicate_1(List('a, 'b, 'c, 'c, 'd)) should be(List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
      duplicate_1(List(List(1,2),List(3,4,5))) should be(List(List(1,2),List(1,2),List(3,4,5),List(3,4,5)))
    }
  }

  describe("P15") {
    it("duplicateN test") {
      import study.scala.list.P15._
      duplicateN(3,List('a, 'b, 'c, 'c, 'd)) should be(List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
      duplicateN(3, List(List(1,2),List(3,4,5))) should be(List(List(1,2),List(1,2),List(1,2),List(3,4,5),List(3,4,5),List(3,4,5)))
    }
  }

  describe("P17") {
    it("split test") {
      import study.scala.list.P17._
      split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      split(3, List(List(1,2),List(3,4,5),List(6,7),List(8,9))) should be(List(List(1,2),List(3,4,5),List(6,7)), List(List(8,9)))
    }
  }

  describe("P18") {
    it("slice test") {
      import study.scala.list.P18._
      slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('d, 'e, 'f, 'g))
      slice(1, 3, List(List(1,2),List(3,4,5),List(6,7),List(8,9))) should be(List(List(3,4,5),List(6,7)))
    }
  }

  describe("P19") {
    it("rotate test") {
      import study.scala.list.P19._
      rotate_1(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
      rotate_1(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
      rotate_1(14, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
      rotate_2(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
      rotate_2(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
      rotate_2(14, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
    }
  }
}
