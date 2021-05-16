import scala.math._
object Q2 extends App{
  def sphereVolume(radius:Double):Double = 4.0/3.0 * Pi * pow(radius,3)

  print("The volume of the sphere is: "+ sphereVolume(5))
}
