package tasksfromjavasite;

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the quantity");

        int quantity = scan.nextInt();

        System.out.println("enter the price");

        int price = scan.nextInt();

        int revenue=quantity*price;

        if(revenue>=5000) {

            System.out.print("you win %10 discount. Net revenue is : ");

            System.out.println("revenue = " + (revenue*0.90));

        } else {

            System.out.println("revenue = " + revenue);
        }





    }
}
