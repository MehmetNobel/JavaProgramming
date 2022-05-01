package day_45_Abstraction_2.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square sq1=new Square("square1",4);

        Cube cube1=new Cube(5);

        Circle c1=new Circle(1);

        System.out.println("c1 = " + c1);

        System.out.println("cube1 = " + cube1);

        sq1.area();

        System.out.println("sq1 = " + sq1);

        sq1.setSide(0);


    }
}
