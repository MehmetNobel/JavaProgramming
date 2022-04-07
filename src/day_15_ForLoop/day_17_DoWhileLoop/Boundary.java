package day_15_ForLoop.day_17_DoWhileLoop;

import java.util.Scanner;

public class Boundary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the lastnumber");

        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {

            sum +=i;

        }
        System.out.println(sum);
    }
}
