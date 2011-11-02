import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import cocodev.pictura.vecmath.Point3d
import cocodev.pictura.vecmath.Vector3d


class Point3dSuite extends FunSuite with BeforeAndAfter
{

  val ax = 1.0
  val ay = 2.0
  val az = 3.0
  var a: Point3d = _

  val bx = 3.0
  val by = 2.0
  val bz = 1.0
  var b: Point3d = _

  val ux = 4.0
  val uy = 5.0
  val uz = 6.0
  var u: Vector3d = _

  before
  {
    a = new Point3d(ax, ay, az)
    b = new Point3d(bx, by, bz)
    u = new Vector3d(ux, uy, uz)
  }

  test("Vector addition")
  {
    val p: Point3d = a + u
    val actual = p.getCoords
    val expected = (ax + ux, ay + uy, az + uz)
    assert(actual === expected)
  }

  test("Vector substraction")
  {
    val p: Point3d = a - u
    val actual = p.getCoords
    val expected = (ax - ux, ay - uy, az - uz)
    assert(actual === expected)
  }

  test("Point substraction")
  {
    val u: Vector3d = a - b
    val actual = u.getCoords
    val expected = (ax - bx, ay - by, az - bz)
    assert(actual === expected)
  }
}
