package day_31_Constructors;

public class Rectangle {

    double length, width;

    double area, perimeter;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    public double area(){

        area=width*length;

        return area;
    }

    public double perimeter(){

        perimeter=2*(width+length);

        return perimeter;
    }




}
