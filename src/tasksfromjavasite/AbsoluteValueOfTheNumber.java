package tasksfromjavasite;

import java.util.Scanner;

public class AbsoluteValueOfTheNumber {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number");

        int num = scan.nextInt();

        int result = 0;

        if (num >= 0) {

            result = num;
        } else if (num < 0) {

            result = num * (-1);
        }

        System.out.println(result);
    }
}