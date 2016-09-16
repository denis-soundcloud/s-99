import scala.collection.immutable.List

def length[A](list: List[A]): Int = list match {
  case a :: rest => 1 + length(rest)
  case _ => 0
}

println(length(List(1, 1, 2, 3, 5, 8)))
