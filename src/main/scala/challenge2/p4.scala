package io.geekya.ctfp
package challenge2

// How many different functions are there from Bool to Bool?
// Can you implement them all?
object p4 {
  val allTrue: Boolean => Boolean = _ => true
  val allFalse: Boolean => Boolean = _ => false
  val not: Boolean => Boolean = !_
  val id: Boolean => Boolean = identity
}
