package day_39_Recap.shapeTask;

public class Circle extends Shape{

    public static double pi = 3.14;

    private double radius;

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("radius data can not be zero or negative! ");
            System.exit(1);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                " name=" + this.getName() +
                " radius=" + this.radius +
                " area=" + area() +
                " perimeter=" + perimeter() +
                '}';
    }
}
