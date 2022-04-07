package day_15_ForLoop.day_17_DoWhileLoop;

import java.util.Scanner;

public class UntilNegativeNumberEntry {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String result="";

        while (true) {

            System.out.println("enter a number");

            int num = scan.nextInt();

            if (num < 0) {
                break;
            }
            result += num;
        }
        System.out.println("result = " + result);
    }
}
