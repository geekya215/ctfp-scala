package io.geekya.ctfp
package challenge6

// Show the isomorphism between Maybe a and Either () a
object p1 {
  def maybeToEither[A](maybe: Option[A]): Either[Unit, A] = maybe match {
    case Some(a) => Right(a)
    case None => Left(())
  }

  def eitherToMaybe[A](either: Either[Unit, A]): Option[A] = either match {
    case Right(a) => Some(a)
    case Left(_) => None
  }
}
