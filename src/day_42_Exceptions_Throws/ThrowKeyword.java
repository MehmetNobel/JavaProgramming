package day_42_Exceptions_Throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter your age ");

        int age=scan.nextInt();

        if(age<0){

            throw new InputMismatchException("AGE CAN NOT BE LESS THAN 0!!");
        }

        if(age>21){

            System.out.println("you are eligible to vote");
        }

        else{
            throw new RuntimeException("you are not eligible to vote!!");

        }


    }


}
