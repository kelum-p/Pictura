package cocodev.pictura.vecmath

class Tuple3d(
  private val x: Double,
  private val y: Double,
  private val z: Double)
{
  def this(value: Double) = this(value, value, value)

  def getX = x
  def getY = y
  def getZ = z

  def getCoords = (x, y, z)

  override def toString = "(" + x + ", " + y + ", " + z + ")"
}
