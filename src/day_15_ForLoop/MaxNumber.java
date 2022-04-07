package day_15_ForLoop;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int max=-2147000000;

        for (int i = 1; i <=5 ; i++) {

            System.out.println("enter the number");

            int num= scan.nextInt();

            if (num>max){

                max=num;
            }

        }

        System.out.println("maximum number is : "+max);


    }
}
