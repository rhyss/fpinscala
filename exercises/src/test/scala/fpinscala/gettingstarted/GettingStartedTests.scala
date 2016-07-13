package fpinscala.gettingstarted

import org.scalatest.FlatSpec
import org.scalatest.Matchers._
import MyModule.fib

class GettingStartedTests extends FlatSpec {

  "fib" should "return the fibonacci values in order" in {
    fib(0) shouldBe 0
    fib(1) shouldBe 1
    fib(2) shouldBe 1
    fib(3) shouldBe 2
  }
}
