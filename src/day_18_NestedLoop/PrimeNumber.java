package day_18_NestedLoop;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number");

        int number = scan.nextInt();

        int count = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                count++;
            }

        }

        if (count == 2) {

            System.out.println("this is a prime number");
        }else {
            System.out.println("this is not a prime number");
        }


    }
}
