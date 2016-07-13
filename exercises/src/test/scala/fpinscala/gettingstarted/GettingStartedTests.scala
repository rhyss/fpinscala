package fpinscala.gettingstarted

import org.scalatest.FlatSpec
import org.scalatest.Matchers._
import MyModule.fib
import PolymorphicFunctions.isSorted

class GettingStartedTests extends FlatSpec {

  val compare = (a : Int, b : Int) => a <= b

  "fib" should "return the fibonacci values in order" in {
    fib(0) shouldBe 0
    fib(1) shouldBe 1
    fib(2) shouldBe 1
    fib(3) shouldBe 2
  }

  "isSorted" should "return true when an array is sorted according to the comparator" in {
    isSorted[Int](Array(1, 2, 3), compare)
  }

  "isSorted" should "return false when an array is not according to the comparator" in {
    isSorted[Int](Array(1, 2, 3, 1), compare)
  }

  "isSorted" should "return true for an empty Array" in {
    isSorted[Int](Array(), compare)
  }

  "isSorted" should "return true for an Array with one element" in {
    isSorted[Int](Array(1), compare)
  }
}
