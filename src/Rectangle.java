public class Rectangle extends Shape2d {
    private double P1;
    private double P2;
    private double P3;
    private double P4;

    public Rectangle() {
        P1 = 1;
        P2 = 1;
        P3 = 1;
        P4 = 1;
    }

    public Rectangle(double p1, double p2, double p3, double p4) {
        P1 = p1;
        P2 = p2;
        P3 = p3;
        P4 = p4;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public double getP3() {
        return P3;
    }

    public void setP3(double p3) {
        P3 = p3;
    }

    public double getP4() {
        return P4;
    }

    public void setP4(double p4) {
        P4 = p4;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "P1=" + P1 +
                ", P2=" + P2 +
                ", P3=" + P3 +
                ", P4=" + P4 +
                '}';
    }

    public double Area(double l, double w) {
        double sum = l * w;
        return sum;
    }

    @Override
    public double Circumference(double A, double B) {
        return 2 * (A + B);
    }
    public double CountVertics(double p1,double p2, double p3,double p4){
        return this.P1 + this.P2 + this.P3 + this.P4;
    }
}

