package replit_1.tasks_muhtar;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);

        System.out.println("enter the radius");

        double r=scan.nextDouble();

        double area=Math.PI*r*r;

        System.out.println("area = " + area);







    }
}
