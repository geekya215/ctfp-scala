package io.geekya.ctfp
package challenge1

// Implement the composition function in your favorite language.
// It takes two functions as arguments and returns a function
// that is their composition.
object p2 {
  def compose[A, B, C](f: B => C, g: A => B): A => C =
    a => f(g(a))
}