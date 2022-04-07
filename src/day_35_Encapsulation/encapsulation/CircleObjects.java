package day_35_Encapsulation.encapsulation;

public class CircleObjects {

    public static void main(String[] args) {

        Circle c1=new Circle(1);

        c1.setRadius(c1.getRadius()+1);

        System.out.println("c1.getRadius() = " + c1.getRadius());

        System.out.println("c1 = " + c1);

        System.out.println("c1.area() = " + c1.area());

        System.out.println("c1.perimeter() = " + c1.perimeter());

        Circle arr[]={c1, new Circle(2),new Circle(3)};

        for (Circle circle : arr) {
            System.out.println(circle);

        }

        for (Circle circle : arr) {

            System.out.println(circle.getRadius());

        }




    }
}
