package day_19_LoopPractices;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("please enter the short side of the rectangle");

            double shortt = scan.nextDouble();

            if (shortt <= 0) {
                System.err.println("Invalid Entry for the short side of the square");

                System.exit(0);
            }

            System.out.println("please enter the long side of the rectangle");

            double longg = scan.nextDouble();

            if (longg <= 0) {
                System.err.println("Invalid Entry for the long side of the square");

                System.exit(0);
            }


            double perimeter = (shortt+longg) * 2;

            double area = longg*shortt;

            System.out.println("perimeter = " + perimeter);
            System.out.println("area = " + area);

            System.out.println("would you like to calculate another rectangle");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("please enter valid answer!!");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {

                System.out.println("Thank you for using Cydeo Circle Calculator APP");

                break;


            }
        }

    }
}
