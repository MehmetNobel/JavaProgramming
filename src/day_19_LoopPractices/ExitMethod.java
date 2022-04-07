package day_19_LoopPractices;

import java.util.Scanner;

import java.util.Scanner;

public class ExitMethod {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n1 = scan.nextInt();
        System.out.println("enter the operator");
        char op = scan.next().charAt(0);

        if (!(op == '+' || op == '-')) {

            System.err.println("Invalid entry!!");

            System.exit(0);
        }

        System.out.println("enter the second number");
        int n2 = scan.nextInt();

        if (op == '+') {

            System.out.println(n1 + n2);

        } else {

            System.out.println(n1 - n2);

        }

    }


}




