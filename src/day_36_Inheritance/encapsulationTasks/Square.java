package day_36_Inheritance.encapsulationTasks;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0)
            return;
        this.side = side;
    }

    public double calcArea() {
        return side * side;
    }

    public double calcPerimeter() {
        return 4 * side;
    }


    public String toString() {
        return "side is " + side+
                "\nperimeter is :" + calcPerimeter() +
                "\narea is :" + calcArea();
    }

    public static void main(String[] args) {

        Square sq1=new Square(2);
        System.out.println("sq1.calcArea() = " + sq1.calcArea());
        System.out.println("sq1.calcPerimeter() = " + sq1.calcPerimeter());
        System.out.println("sq1 = " + sq1);


    }

}
/*
1. Square Task:
1.1 Create a class named Square:
Private variables:
side
Encapsulate all the fields
Condition:
side of the
square should not be negative
Add a constructor that allows user to
set all the fields when the object is created.
(If the arguments not valid it should not be set to the instances)
Methods:
calcArea(): returns the area
of square
calcPerimeter(): returns the
perimeter of square
toString(): can display the
side, area, perimeter of square when object is passed in print statement
 */