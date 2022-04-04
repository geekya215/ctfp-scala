package io.geekya.ctfp
package challenge6

// Continuing with the previous example: We can easily add a new function
// circ that calculates the circumference of a Shape. We can do it without
// touching the definition of Shape:
// circ :: Shape -> Float
// circ (Circle r) = 2.0 * pi * r
// circ (Rect d h) = 2.0 * (d + h)
// Add circ to your C++ or Java implementation. What parts of the original
// code did you have to touch?
object p3 {
  sealed trait Shape {
    def area: Double
    def circ: Double
  }

  case class Circle(radius: Float) extends Shape {
    override def area: Double = math.Pi * radius * radius
    override def circ: Double = 2.0 * math.Pi * radius
  }

  case class Rect(width: Float, height: Float) extends Shape {
    override def area: Double = width * height
    override def circ: Double = 2.0 * (width + height)
  }
}
