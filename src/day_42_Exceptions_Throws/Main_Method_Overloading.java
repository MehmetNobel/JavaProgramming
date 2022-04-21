package day_42_Exceptions_Throws;

import java.util.Scanner;

public class Main_Method_Overloading {

    public static void main(int a, int b) {  // we can use 2 type of loaded main method

        System.out.println(a + b);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        main(4, 4);

       /* try {
            throw new RuntimeException("this is an exception");  // we can use both checked exception
            // and unchecked exception with the throw keyword
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        */

        System.out.println("hello");

        System.out.println("enter the age");

        int age = scan.nextInt();

        if (age < 21) {

            throw new RuntimeException("you are not eligible to vote");
        } else {

            System.out.println("you are eligible to vote");
        }


    }
}
