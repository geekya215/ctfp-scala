package io.geekya.ctfp
package challenge6

// Here’s a sum type defined in Haskell:
// data Shape = Circle Float
//            | Rect Float Float
// When we want to define a function like area that acts on a Shape, we 
// do it by pattern matching on the two constructors:
// area :: Shape -> Float
// area (Circle r) = pi * r * r
// area (Rect d h) = d * h
// Implement Shape in C++ or Java as an interface and create two classes:
// Circle and Rect. Implement area as a virtual function.
object p2 {
  sealed trait Shape {
    def area: Double
  }

  case class Circle(radius: Float) extends Shape {
    override def area: Double = math.Pi * radius * radius
  }

  case class Rect(width: Float, height: Float) extends Shape {
    override def area: Double = width * height
  }
}
