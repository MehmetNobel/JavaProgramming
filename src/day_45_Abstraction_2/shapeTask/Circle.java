package day_45_Abstraction_2.shapeTask;

public class Circle extends Shape {

    private double radius;

    public static double pi=3.14;

    public Circle(double radius) {
        super("radius");
        this.radius=radius;
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
        return getClass().getSimpleName()+"{"+"radius : "+radius+
                " area : "+area()+
                " perimeter : "+perimeter()+
                "}";

    }
}
