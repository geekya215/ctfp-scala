package io.geekya.ctfp
package challenge5

object p4 {
  sealed trait Either[A, B]
  case class Left[A](a: A) extends Either[A, Nothing]
  case class Right[B](b: B) extends Either[Nothing, B]
}
