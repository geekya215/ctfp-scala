package io.geekya.ctfp
package challenge4

// Construct the Kleisli category for partial functions (define 
// composition and identity).
object p1 {
  def id[A](a: A): Option[A] = Some(a)
  
  def compose[A, B, C](f: A => Option[B], g: B => Option[C]): A => Option[C] =
    a => for {
      b <- f(a)
      c <- g(b)
    } yield c
}
