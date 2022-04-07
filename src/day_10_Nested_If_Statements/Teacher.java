package day_10_Nested_If_Statements;

import java.util.Scanner;

public class Teacher {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name :");

        String name = s.nextLine();

        if (name.equals("Chen")) {

            System.out.println("teacher");

        } else {

            System.out.println("student");
        }




    }
}
