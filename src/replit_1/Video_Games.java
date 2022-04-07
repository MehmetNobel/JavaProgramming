package replit_1;

import java.util.Scanner;

public class Video_Games {

    public static void main(String[] args) {

        System.out.println("Enter number of coupons: ");

        Scanner scan = new Scanner(System.in);

        int cuopons = scan.nextInt();

        int Number_of_Candies=cuopons/10;

        int Number_of_Gumballs=(cuopons%10)/3;

        if (Number_of_Candies>0||Number_of_Gumballs>0) {

            System.out.println("Number of Candies: " + Number_of_Candies);

            System.out.println("Number of Gumballs: " + Number_of_Gumballs);

        }else {

            System.out.println("Not enough coupons");

        }


    }
}
