package day_45_Abstraction_2.shapeTask;

public class Cube extends Shape implements Volume{

    private double side;

    public Cube( double side) {
        super("cube");
        this.side=side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    @Override
    public double volume() {

        return side*side*side;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{"+"side : "+side+
                " area : "+area()+
                " perimeter : "+perimeter()+
                " volume : "+volume()+
                "}";

    }
}
