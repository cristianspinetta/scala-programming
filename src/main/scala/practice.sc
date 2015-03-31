import practice._

val hello = new Hello

println(hello.sayHello("Scala"))
val x = 13
val xs = new Nil[Int]
val intList = new Cons[Int](x, xs)
val anonFunc = {
  class AnonFunc extends Function1[Int, Int] {
    def apply(x: Int): Int = x * x
  }
  new AnonFunc
}

anonFunc(3)

def sugarAnonFunc = (x: Int) => x*x

sugarAnonFunc(3)

val list = List(4,5)
list.head
list.tail.head
list.tail.tail
//nth(0, intList)
//nth(1, intList)
//nth(5, intList)