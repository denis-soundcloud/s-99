import scala.collection.immutable.List

def penultimate[A](list: List[A]): A = list match {
  case a :: b :: List () => a
  case a :: b :: rest => penultimate(b :: rest)
  case _ => ???
}

println(penultimate(List(1, 1, 2, 3, 5, 8)))
