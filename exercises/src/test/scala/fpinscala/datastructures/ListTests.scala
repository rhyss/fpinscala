package fpinscala.datastructures

import org.scalatest.FlatSpec
import org.scalatest.Matchers._
import fpinscala.datastructures.List._

/**
  * Created by rhys on 18/07/2016.
  */
class ListTests  extends FlatSpec {

  "tail" should "return Nil if a list has one item" in {
    tail(List(1)) shouldBe Nil
  }

  "tail" should "throw exception if a list is Nil" in {
    intercept[NoSuchElementException]{
      tail(Nil)
    }
  }

  "tail" should "remove the first element of the list containing items" in {
    tail(List(1, 2, 3)) shouldBe List(2, 3)
  }

}
