package tasks_statics_constructors;

public class Circle {

    public double radius, diameter;

    public static double pi=3.14;

    public Circle(double radius){

        this.radius=radius;
        this.diameter=this.radius*2;

    }

    public double calcArea(){

        return radius*radius*pi;

    }

    public double calcPerimeter(){

        return diameter*pi;
    }

    public static void printPi(){

        System.out.println("pi is : "+pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", perimeter of circle is =" + calcPerimeter() +
                ", area of circle is =" + calcArea() +
                '}';
    }
}

class Test2{

    public static void main(String[] args) {

        Circle c1=new Circle(1);

        System.out.println("c1 = " + c1);

        Circle.printPi();

    }

}



/*
2. Circle Task:
1. Create a class named Circle:
Attributes:
instance: radius, diameter
static: pi
Add a constructor that can set All the
fields (instances)
HINT: we only need to know
the radius to set the radius & diameter
Actions:
calcArea(): returns the area
of Circle
calcPerimeter(): returns the
perimeter of Circle
printPi(): displays PI value
toString(): displays the
radius, diameter, pi, area and perimeter of the circle when the object of
circle is passed in the print statement
 */