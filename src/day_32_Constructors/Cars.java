package day_32_Constructors;

public class Cars {

    public static void main(String[] args) {

        new Contstructors_Overloading("hyundai");

        System.out.println("*******************************");

        new Contstructors_Overloading("hyundai","era");

        System.out.println("*******************************");
        new Contstructors_Overloading("hyundai","era", 2009);

        System.out.println("*******************************");
        new Contstructors_Overloading("hyundai","era", 2009, 108000);

        System.out.println("*******************************");
        new Contstructors_Overloading("hyundai","era", 2009, 108000, "black");


        Contstructors_Overloading car1=new Contstructors_Overloading("hyundai");

        System.out.println(car1);





    }
}
