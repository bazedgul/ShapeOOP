public class Sphere extends Shape3d{
    private double Center;
    private double Radius;

    public Sphere() {
        Center = 0.0;
        Radius = 0.0;
    }

    public Sphere(double center, double radius) {
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
        return "Sphere{" +
                "Center=" + Center +
                ", Radius=" + Radius +
                '}';
    }

    public double Area(double center , double radius){
        radius = radius * radius;
      return 4 * 3.14 *radius;
    }

    @Override
    public double GetVolume(double radius) {
        radius   = radius*radius*radius;
        return  (4/3) * 3.14 * radius ;
    }

}
