package tasksfromjavasite;

import java.util.Scanner;

public class LargestAndSmallestNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int largestNumber=-2_000_000_000;
        int smallestNumber=2_000_000_000;

        while (true) {
            System.out.println("enter the number");
            int n1 = scan.nextInt();

            if (n1 > largestNumber) {

                largestNumber = n1;
            }
            if (n1 < smallestNumber) {
                smallestNumber = n1;

            }

            System.out.println("do u wanna go on?");

            String answer= scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

                System.err.println("please enter valid answer : yes or no");

                answer = scan.next();

            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }


            System.out.println("smallestNumber = " + smallestNumber);
            System.out.println("largestNumber = " + largestNumber);

        }


    }
}
