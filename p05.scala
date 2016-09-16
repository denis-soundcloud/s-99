import scala.collection.immutable.List

def concat[A](list: List[A], elem: A): List[A] = list match {
  case a :: rest => a :: concat(rest, elem)
  case _ => List(elem)
}

def reverse[A](list: List[A]): List[A] = list match {
  case a :: rest => concat(reverse(rest), a)
  case _ => List()
}

println(reverse(List(1, 1, 2, 3, 5, 8)))
