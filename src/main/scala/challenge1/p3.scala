package io.geekya.ctfp
package challenge1

// Write a program that tries to test that your
// composition function respects identity.
def p3(f: Int => Int, g: Int => Int) = {
  val h = f compose g
  val i = g andThen f
  h(1) == i(1)
}