package io.geekya.ctfp
package challenge2

import scala.util.Random

// Define a higher-order function (or a function object) memoize
// in your favorite language. This function takes a pure function
// f as an argument and returns a function that behaves almost
// exactly like f, except that it only calls the original function
// once for every argument, stores the result internally, and
// subsequently returns this stored result every time it’s called
// with the same argument. You can tell the memoized function from the
// original by watching its performance. For instance, try to memoize
// a function that takes a long time to evaluate. You’ll have to wait
// for the result the first time you call it, but on subsequent calls,
// with the same argument, you should get the result immediately.
object p1 {
  def memoize[A, B](f: A => B): A => B = {
    val cache = scala.collection.mutable.Map[A, B]()
    (a: A) => cache.getOrElseUpdate(a, f(a))
  }
}
