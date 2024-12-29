object CentreAndRadiusOfACirclePassingThrough3PointsInAPlane {

  def main(args: Array[String]): Unit = {
    val circle = computeCircle(Point(22.83, 2.07), Point(14.39, 30.24), Point(33.65, 17.31))
    println(circle)
  }

  def computeCircle(pointOne: Point, pointTwo: Point, pointThree: Point): Circle = {
    val centreX = 0.5 *
      (
        (pointOne.x * pointOne.x + pointOne.y * pointOne.y) * (pointThree.y - pointTwo.y) +
          (pointTwo.x * pointTwo.x + pointTwo.y * pointTwo.y) * (pointOne.y - pointThree.y) +
          (pointThree.x * pointThree.x + pointThree.y * pointThree.y) * (pointTwo.y - pointOne.y)
        ) /
      (
        pointOne.x * (pointThree.y - pointTwo.y) +
          pointTwo.x * (pointOne.y - pointThree.y) +
          pointThree.x * (pointTwo.y - pointOne.y)
        )

    val centreY = 0.5 *
      (
        (pointOne.x * pointOne.x + pointOne.y * pointOne.y) * (pointThree.x - pointTwo.x) +
          (pointTwo.x * pointTwo.x + pointTwo.y * pointTwo.y) * (pointOne.x - pointThree.x) +
          (pointThree.x * pointThree.x + pointThree.y * pointThree.y) * (pointTwo.x - pointOne.x)
        ) /
      (
        pointOne.y * (pointThree.x - pointTwo.x) +
          pointTwo.y * (pointOne.x - pointThree.x) +
          pointThree.y * (pointTwo.x - pointOne.x)
        )

    val radius = Math.sqrt((centreX - pointOne.x) * (centreX - pointOne.x) +
      (centreY - pointOne.y) * (centreY - pointOne.y))

    Circle(Point(centreX, centreY), radius)
  }
}
