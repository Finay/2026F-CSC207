/** Rectangle. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Make Rectangle.
   *
   * @param w width
   * @param h height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Get area.
   *
   * @return thing
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor f
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Is.
   *
   * @param other is
   * @return thing
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
