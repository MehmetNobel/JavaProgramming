package day_12_Scanner;

import java.util.Scanner;

public class Scanner_Practice_NextLine {

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println(" enter the age");

        int age=scan.nextInt();

        scan.nextLine();

        System.out.println("enter the full name");

        String name=scan.nextLine();

        System.out.println("age = " + age);

        System.out.println("name = " + name);








    }
}
