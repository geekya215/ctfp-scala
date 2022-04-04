package io.geekya.ctfp
package challenge6

// Show that a + a = 2 × a holds for types (up to isomorphism). Remember
// that 2 corresponds to Bool, according to our translation table.
object p5 {
  def sumToProduct[A](either: Either[A, A]): (Boolean, A) =
    either match {
      case Left(a) => (false, a)
      case Right(a) => (true, a)
    }

  def productToSum[A](product: (Boolean, A)): Either[A, A] =
    product match {
      case (false, a) => Left(a)
      case (true, a) => Right(a)
    }
}
