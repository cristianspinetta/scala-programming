package practice

/**
 * Created by cristian on 21/03/15.
 */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head = throw new Error("Nil.head")
  def tail = throw new Error("Nil.tail")
}

object List {
  def apply[T](): List[T] = new Nil[T]
  def apply[T](x: T) = new Cons[T](x, new Nil[T])
  def apply[T](x: T, y: T) = new Cons(x, new Cons[T](y, new Nil[T]))
}
