case class Circle(centre: Point, radius: Double) {
  override def toString: String = s"centre: (${format(centre.x)}, ${format(centre.y)}), radius = ${format(radius)}"

  private def format(value: Double): String = f"$value%.5f"
}
