package day_15_ForLoop;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int min=90000000;

        for (int i = 1; i <=5 ; i++) {

            System.out.println("enter the number");

            int num= scan.nextInt();

            if (num<min){

                min=num;
            }

        }

        System.out.println("minumum number is : "+min);


    }
}
