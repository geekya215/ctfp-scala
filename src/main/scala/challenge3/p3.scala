package io.geekya.ctfp
package challenge3

// onsidering that Bool is a set of two values True and False, show that it
// forms two (set-theoretical) monoids with respect to, respectively, operator
// && (AND) and || (OR).
object p3 {
  trait Monoid[A] {
    def op(a1: A, a2: A): A
    def zero: A
  }

  implicit val boolOrMonoid: Monoid[Boolean] = new Monoid[Boolean] {
    def op(a1: Boolean, a2: Boolean): Boolean = a1 || a2
    def zero: Boolean = false
  }

  implicit val boolAndMonoid: Monoid[Boolean] = new Monoid[Boolean] {
    def op(a1: Boolean, a2: Boolean): Boolean = a1 && a2
    def zero: Boolean = true
  }
}
