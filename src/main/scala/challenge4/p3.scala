package io.geekya.ctfp
package challenge4

// Compose the functions safe_root and safe_reciprocal to implement 
// safe_root_reciprocal that calculates sqrt(1/x) whenever possible.
object p3 {
  def safe_root(x: Double): Option[Double] = {
    if (x < 0) None
    else Some(math.sqrt(x))
  }

  val safe_reciprocal: Double => Option[Double] = p2.safe_reciprocal

  def safe_root_reciprocal(x: Double): Option[Double] = {
    p1.compose(safe_root, safe_reciprocal)(x)
  }
}
