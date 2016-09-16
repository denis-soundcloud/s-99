import scala.collection.immutable.List

def last[A](list: List[A]): A = list match {
  case a :: b :: rest => last(b :: rest)
  case a :: List () => a
  case List() => ???
}

println(last(List(1, 1, 2, 3, 5, 8)))
