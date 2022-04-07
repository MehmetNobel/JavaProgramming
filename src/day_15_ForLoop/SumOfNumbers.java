package day_15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int result = 0;

        /*for (int i = 0; i <= 100; i++) {

            result += i;
        }
        System.out.println("result = " + result);*/

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("enter the number");

            result += scan.nextInt();

        }

        System.out.println("result = " + result);

    }
}
