package day_12_Scanner;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("please enter the radius value");

        double radius=scan.nextDouble(); // variable a atıyoruz değeri.

        double cArea=radius*radius*Math.PI;

        double cPerimeter=2*radius*Math.PI;

        System.out.println("cArea = " + cArea);
        System.out.println("cPerimeter = " +cPerimeter);

        scan.close();





    }
}
