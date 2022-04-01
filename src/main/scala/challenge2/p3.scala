package io.geekya.ctfp
package challenge2

import scala.util.Random

object p3 {
  // Most random number generators can be initialized with a seed. Implement
  // a function that takes a seed, calls the random number generator with that
  // seed, and returns the result. Memoize that function. Does it work?
  def main(args: Array[String]): Unit = {
    val seed = 1
    val f = p1.memoize((seed: Int) => Random(seed).nextInt())
    assert(f(seed) == f(seed))
  }
}
