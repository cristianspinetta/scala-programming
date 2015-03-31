package practice

/**
 * Created by cristian on 22/03/15.
 */
object ListUtils {

  def nth[T](n: Integer, list: List[T]): T = {
    if (list.isEmpty) throw new IndexOutOfBoundsException("n too high")
    else if (n == 0) list.head
    else nth(n - 1, list.tail)
  }
}
