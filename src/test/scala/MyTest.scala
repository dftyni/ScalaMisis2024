import scala.math.BigDecimal
import CentreAndRadiusOfACirclePassingThrough3PointsInAPlane.computeCircle

class MyTest extends munit.FunSuite:
  test("points on a circle") {
    val p1 = Point(22.83, 2.07)
    val p2 = Point(14.39, 30.24)
    val p3 = Point(33.65, 17.31)
    val circle = computeCircle(p1, p2, p3)

    val points = List(p1, p2, p3)
    for(p <- points){
      assertEquals(UpperRound(DistanceBetweenPoints(p, circle.centre)), UpperRound(circle.radius))
      println(s"$p on a circle")
    }
  }

  def DistanceBetweenPoints(pointOne: Point, pointTwo: Point): Double = {
    Math.sqrt((pointOne.x - pointTwo.x) * (pointOne.x - pointTwo.x) + (pointOne.y - pointTwo.y) * (pointOne.y - pointTwo.y))
  }

  def UpperRound(value:Double): Double = {
    BigDecimal(value).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }