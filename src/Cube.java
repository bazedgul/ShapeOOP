public class Cube extends Shape3d {
    private double Points;

    public Cube() {
        Points = 4;
    }

    public Cube(double points) {
        Points = points;
    }

    public double getPoints() {
        return Points;
    }

    public void setPoints(double points) {
        Points = points;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "Points=" + Points +
                '}';
    }

    public double Area(double A) {
        return 0;
    }

    @Override
    public double GetVolume(double V) {
        return V * V * V;
    }
    public double CountVertics(double points){
        return this.Points;
    }
}
