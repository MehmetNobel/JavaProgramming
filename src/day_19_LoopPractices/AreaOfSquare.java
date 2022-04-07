package day_19_LoopPractices;

import java.util.Scanner;

public class AreaOfSquare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("please enter the side of the square");

            double side = scan.nextDouble();

            if (side <= 0) {
                System.err.println("Invalid Entry for the side of the square");

                System.exit(0);
            }

            double perimeter = side * 4;

            double area = 4*side;


            System.out.println("perimeter = " + perimeter);
            System.out.println("area = " + area);

            System.out.println("would you like to calculate another square");
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
