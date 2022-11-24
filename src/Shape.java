public abstract class Shape {
    private String Name;

    public Shape() {
        Name = null;
    }

    public Shape(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "Name='" + Name + '\'' +
                '}';
    }
    public abstract double GetArea();
}
