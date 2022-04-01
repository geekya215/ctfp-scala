package io.geekya.ctfp
package challenge2

import scala.util.Random

object p2 {
  // Try to memoize a function from your standard library that you normally
  // use to produce random numbers. Does it work?
  def main(args: Array[String]): Unit = {
    val random = Random
    val f: Random => Int = p1.memoize(random => random.nextInt())
    assert(f(random) == f(random))
  }
}
