package day_45_Abstraction_2.shapeTask;

public class Square extends Shape{

    private double side;

    public Square(String name, double side) {
        super(name);
        setSide(side);
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0)
            throw new RuntimeException("invalid side data "+side);
        this.side = side;
    }

    @Override
    public double area() {

        return side*side;

    }

    @Override
    public double perimeter() {

        return  4*side;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{"+"side : "+side+
                " area : "+area()+
                " perimeter : "+perimeter()+
                "}";
    }
}
