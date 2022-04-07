package day_18_NestedLoop;

import java.util.Scanner;

public class CydeoCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result = 0;

        while (true) {

            System.out.println("enter the first number");

            int first = scan.nextInt();

            System.out.println("enter the math operator");

            String operator = scan.next();

            while (!(operator.equalsIgnoreCase("+") ||
                    operator.equalsIgnoreCase("-") ||
                    operator.equalsIgnoreCase("*") ||
                    operator.equalsIgnoreCase("/"))) {

                System.err.println("please enter the correct math operator");
                operator = scan.next();

            }
            System.out.println("enter the second number");

            int second = scan.nextInt();

            if (operator.equalsIgnoreCase("+")) {

                result = first + second;
            } else if (operator.equalsIgnoreCase("-")) {

                result = first - second;
            } else if (operator.equalsIgnoreCase("*")) {

                result = first * second;
            } else if (operator.equalsIgnoreCase("/")) {

                result = first / second;
            }

            System.out.println("result is: " + result);
            System.out.println("do u wanna continue");

            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

                System.err.println("please re-enter your request!! ");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("thank you for using CYDEO calculator :)");
                break;
            }


        }


    }
}