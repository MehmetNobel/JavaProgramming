package day_39_Recap.shapeTask;

public class Rectangle extends Shape {

    private double width, length;


    public Rectangle(String name, double width, double length) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("width data cannot be zero or negative!");
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            System.err.println("length data cannot be zero or negative!");
            return;
        }
        this.length = length;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                " area=" + area() +
                " perimeter=" + perimeter() +
                '}';
    }
}
