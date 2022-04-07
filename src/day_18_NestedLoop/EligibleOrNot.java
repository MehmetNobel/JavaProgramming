package day_18_NestedLoop;

import java.util.Scanner;

public class EligibleOrNot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how old are u?");

        int age = scan.nextInt();

        while (!(age > 0 && age < 150)) {

            System.out.println("please enter valid age numbers");

            age = scan.nextInt();
        }

        scan.nextLine();

        System.out.println("Are u a US citizen");

        String answer = scan.nextLine();

        while (!(answer.equalsIgnoreCase("yes") || answer.equals("no"))) {
            System.out.println("Are u a US citizen");
            answer = scan.next();
        }
        if (age >= 18 && answer.equals("yes")) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }

    }


}

