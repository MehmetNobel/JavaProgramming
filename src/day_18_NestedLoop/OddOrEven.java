package day_18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("enter a number?");

            int number = scan.nextInt();

            scan.nextLine();

            if (number % 2 == 0) {
                System.out.println("this is even number");
            } else {
                System.out.println("this is odd number");
            }
            System.out.println("would you like to enter another number");

            String answer = scan.nextLine();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

                System.err.println("please re enter a valid answer");

                answer = scan.nextLine();
            }
            if (answer.equalsIgnoreCase("no")) {

                break;
            }


        }


    }
}
