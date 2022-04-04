package io.geekya.ctfp
package challenge6

// Continuing further: Add a new shape, Square, to Shape and make all the
// necessary updates. What code did you have to touch in Haskell vs. C++ or
// Java? (Even if you’re not a Haskell programmer, the modifications should
// be pretty obvious.)
object p4 {
  sealed trait Shape {
    def area: Double
  }

  case class Circle(radius: Float) extends Shape {
    override def area: Double = math.Pi * radius * radius
  }

  case class Rect(width: Float, height: Float) extends Shape {
    override def area: Double = width * height
  }
  
  case class Square(side: Float) extends Shape {
    override def area: Double = side * side
  }
}
