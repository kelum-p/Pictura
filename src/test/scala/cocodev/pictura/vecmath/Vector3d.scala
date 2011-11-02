import scala.math.sqrt

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import cocodev.pictura.vecmath.Vector3d


class Vector3dSuite extends FunSuite with BeforeAndAfter
{

  test("initilize with 3 params (x, y, z)")
  {
    val vec = new Vector3d(1,1,1)
    val coords = vec.getCoords
    assert(coords === (1.0, 1.0, 1.0))
  }

  test("Initialize uniform vector (single param)")
  {
    val uniVec = new Vector3d(1)
    val coords = uniVec.getCoords
    assert(coords === (1.0, 1.0, 1.0))
  }

  var vec1: Vector3d = _
  var vec2: Vector3d = _

  before
  {
    vec1 = new Vector3d(1, 2, 3)
    vec2 = new Vector3d(3, 2, 1)
  }

  test("Vector addition")
  {
    val vec1PlusVec2 = vec1 + vec2
    val coords = vec1PlusVec2.getCoords
    assert(coords === (4.0, 4.0, 4.0))
  }

  test("Vector substraction")
  {
    val vec1MinusVec2 = vec1 - vec2
    val coords = vec1MinusVec2.getCoords
    assert(coords === (-2.0, 0, 2.0))
  }

  test("Vector right multiplication of double constant")
  {
    val multi = vec1 * 2.5
    assert(multi.getCoords === (2.5, 5.0, 7.5))
  }

  test("Vector right multiplication of int constant")
  {
    val multi = vec1 * 2.0
    assert(multi.getCoords === (2.0, 4.0, 6.0))
  }

  test("Vector left multiplication of double constant")
  {
    val multi = 2.5 *: vec1
    assert(multi.getCoords === (2.5, 5.0, 7.5))
  }

  test("Vector left multiplication of int constant")
  {
    val multi = 2 *: vec1
    assert(multi.getCoords === (2.0, 4.0, 6.0))
  }

  test("Vector division")
  {
    val div = vec1 / 2
    assert(div.getCoords === (0.5, 1.0, 1.5))
  }

  test("Length")
  {
    val length = vec1.length
    val expected = sqrt(14.0)
    assert(length === expected)
  }

  test("Length squared")
  {
    val lenSquared = vec1.lengthSquared
    val expected = 14.0
    assert(lenSquared === expected)
  }

  test("Dot product")
  {
    val dot = vec1 * vec2
    assert(dot === 10)
  }

  test("Cross product")
  {
    val cross = vec1 ^ vec2
    assert(cross.getCoords === (-4.0, 8.0, -4.0))
  }

  test("unary -")
  {
    val unaryMinus = -vec1
    assert(unaryMinus.getCoords === (-1.0, -2.0, -3.0))
  }

  test("+= operator")
  {
    var plusEquals = vec1
    plusEquals += vec2
    val coords = plusEquals.getCoords
    assert(coords === (4.0, 4.0, 4.0))
  }

  test("Normalize - unit vector")
  {
    val norm = vec1.normalize
    assert(norm.length === 1.0)
  }
}
