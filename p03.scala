import scala.collection.immutable.List

def nth[A](n: Int, list: List[A]): A = n match {
  case 0 =>
    list match {
      case a :: rest => a
      case _ => ???
    }
  case _ =>
    list match {
      case a :: rest => nth(n - 1, rest)
      case _ => ???
    }
}

println(nth(0, List(1, 1, 2, 3, 5, 8)))
println(nth(1, List(1, 1, 2, 3, 5, 8)))
println(nth(2, List(1, 1, 2, 3, 5, 8)))
println(nth(3, List(1, 1, 2, 3, 5, 8)))
println(nth(4, List(1, 1, 2, 3, 5, 8)))
println(nth(5, List(1, 1, 2, 3, 5, 8)))
