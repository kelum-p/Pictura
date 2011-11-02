package cocodev.pictura.vecmath

import scala.math.sqrt

class Vector3d(
  private val x: Double,
  private val y: Double,
  private val z: Double) extends Tuple3d(x, y, z)
{
  
  def this(value: Double) = this(value, value, value)
  
  def +(other: Vector3d): Vector3d =
    new Vector3d(x + other.x, y + other.y, z + other.z)

  def -(other: Vector3d): Vector3d =
    new Vector3d(x - other.x, y - other.y, z - other.z)

  def *(value: Double): Vector3d =
    new Vector3d(x * value, y * value, z * value)

  def *:(value: Double): Vector3d =
    this * value

  def /(value: Double): Vector3d =
    new Vector3d(x / value, y / value, z / value)

  def length =
    sqrt(lengthSquared)

  def lengthSquared =
    x * x + y * y + z * z

  def *(other: Vector3d): Double =
    x * other.x + y * other.y + z * other.z

  def ^(other: Vector3d): Vector3d =
    new Vector3d(
      y * other.z - z * other.y,
      z * other.x - x * other.z,
      x * other.y - y * other.x)

  def unary_- = new Vector3d(-x, -y, -z)

  def normalize: Vector3d =
  {
    val len = length
    return new Vector3d(x / len, y / len, z / len)
  }
}



