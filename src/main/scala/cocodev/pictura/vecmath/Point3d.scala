package cocodev.pictura.vecmath

class Point3d(
  private val x: Double,
  private val y: Double,
  private val z: Double) extends Tuple3d(x, y, z)
{
  def this(value: Double) = this(value, value, value)

  def +(u: Vector3d): Point3d =
    new Point3d(x + u.getX, y + u.getY, z + u.getZ)

  def -(u: Vector3d): Point3d =
    new Point3d(x - u.getX, y - u.getY, z - u.getZ)

  def -(p: Point3d): Vector3d = 
    new Vector3d(x - p.getX, y - p.getY, z - p.getZ)
}
