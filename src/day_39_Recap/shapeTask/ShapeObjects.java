package day_39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square1=new Square( 5);

        System.out.println("square1 = " + square1);

        Rectangle rc1=new Rectangle(4,5);

        System.out.println("rc1 = " + rc1);

        Circle c1=new Circle(1);

        System.out.println("c1 = " + c1);

        System.out.println("square1.getSide() = " + square1.getSide());

        square1.setSide(10);

        System.out.println("square1 = " + square1);

        rc1.setWidth(100);

        rc1.setLength(200);

        System.out.println("rc1 = " + rc1);

        System.out.println("c1.area() = " + c1.area());

        System.out.println("c1 = " + c1);


    }




}
