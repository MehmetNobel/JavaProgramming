package day_39_Recap.shapeTask;

public class Square extends Shape{

    private double side;

    public Square(String name,double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        if(side<=0){
            System.err.println("side data must be upper than 0");
            return;
        }
        this.side = side;
    }

    public double area(){

        return  side*side;
    }

    public double perimeter(){

        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " area=" + area() +
                " perimeter=" + perimeter() +
                '}';
    }
}
