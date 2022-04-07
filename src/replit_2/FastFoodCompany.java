package replit_2;

import java.util.Scanner;

public class FastFoodCompany {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter order:");

        String order = scan.nextLine();

        double result = 0;


        switch (order) {

            case "burger":
            case "chicken":
                result = 10;

                break;

            case "soda":
                result = 2;

                break;

            case "fries":

                result=3.5;


        }

        System.out.println(result);


    }
}
