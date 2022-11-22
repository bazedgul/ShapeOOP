public class Circle extends Shape2d {
    private double Center;
    private double Radius;

    public Circle() {
        Center = 0.0;
        Radius = 0.0;
    }

    public Circle(double center, double radius) {
        Center = center;
        Radius = radius;
    }

    public double getCenter() {
        return Center;
    }

    public void setCenter(double center) {
        Center = center;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Center=" + Center +
                ", Radius=" + Radius +
                '}';
    }

    public double Area(double radius) {

        return 3.14 * radius * radius;
    }

    @Override
    public double Circumference(double radius,double center) {
        center = 3.14;
      return 2* center * radius;
    }
}
