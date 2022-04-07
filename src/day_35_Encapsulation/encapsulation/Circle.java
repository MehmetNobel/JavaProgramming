package day_35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);   // we define as secure

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            System.err.println("invalid entry. radius cannot be zero or negative");
            return;}
        else
            this.radius = radius;
    }

    public double perimeter(){

        return 2*radius*pi;
    }
    public double area(){

        return radius*radius*pi;
    }

    public String toString(){

        return " radius is:" + radius+
                " perimeter is:" + perimeter()+
                " area is:" + area();

    }



}
