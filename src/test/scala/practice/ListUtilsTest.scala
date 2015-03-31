package practice

import org.scalatest.FunSuite

/**
 * Created by cristian on 22/03/15.
 */
class ListUtilsTest extends FunSuite {

  val xs = new Cons(13, new Cons(2, new Cons(3, new Nil)))

  test("index 0 should return the first items of the not empty list") {
    assert(ListUtils.nth(0, xs) == 13)
  }

  test("index n should return the element when the list contains it") {
    assert(ListUtils.nth(2, xs) == 3)
  }

  test("given index that is not in the range should throw an IndexOutofBoundsException") {
    intercept[IndexOutOfBoundsException] {
      ListUtils.nth(3, xs)
    }
  }
}
