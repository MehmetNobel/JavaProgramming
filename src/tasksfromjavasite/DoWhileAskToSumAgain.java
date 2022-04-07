package tasksfromjavasite;

import java.util.Scanner;

public class DoWhileAskToSumAgain {

    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);

        int sum=0;


        do {

        System.out.println("enter the first number");

        int n1= scan.nextInt();

        System.out.println("enter the second number");

        int n2= scan.nextInt();

        sum =n1+n2;

        System.out.println("sum is : " + sum);

        System.out.println("do u want to go on");

        String answer =scan.next();


        while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))) {

            System.err.println("please enter valid answer : yes or no");

            answer= scan.next();

        }
        if (answer.equalsIgnoreCase("no")) {
            break;
        }

        }

        while (true);




    }
}
