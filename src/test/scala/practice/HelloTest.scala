package practice

import org.scalatest.FunSuite

/**
 * Created by cristian on 18/03/15.
 */
class HelloTest extends FunSuite {

  test("sayHello method works correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala")
  }

}
