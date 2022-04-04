package io.geekya.ctfp
package challenge4

// Implement the embellished function safe_reciprocal that returns 
// a valid reciprocal of its argument, if it’s different from zero.
object p2 {
  def safe_reciprocal(x: Double): Option[Double] = {
    if (x == 0) None
    else Some(1.0 / x)
  }
}
