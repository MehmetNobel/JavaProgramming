package day_10_Nested_If_Statements;

import java.util.Scanner;

public class E_Commerce {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("what do u want to buy :");

        String thing = scan.nextLine();

        int gift = 100;

        //Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$
        // Smartphone - 1000$ Socks - 5$ USB cable - 10$


        if (thing.equals("Blanket") || thing.equals("Charger") || thing.equals("Hat") || thing.equals("Headphones")
                || thing.equals("Laptop")
                || thing.equals("Panths") || thing.equals("Pillow") || thing.equals("Smartphone") || thing.equals("Socks")
                || thing.equals("Cable")) {

            if (thing.equals("Blanket")) {

                gift -= 60;

                if (gift>0) {

                System.out.println("Thank you for your purchase!\n" +
                        "Your current balance is:  " + gift + "$");}

                else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }



            } else if (thing.equals("Charger")) {

                gift -= 25;

                if (gift>0) {

                    System.out.println("Thank you for your purchase!\n" +
                            "Your current balance is:  " + gift + "$");}

                else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }


            } else if (thing.equals("Hat")) {

                gift -= 25;

                if (gift>0) {

                    System.out.println("Thank you for your purchase!\n" +
                            "Your current balance is:  " + gift + "$");}

                else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }



            } else if (thing.equals("Headphones")) {

                gift -= 30;

                if (gift>0) {

                    System.out.println("Thank you for your purchase!\n" +
                            "Your current balance is:  " + gift + "$");}

                else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            } else if (thing.equals("Laptop")) {

                gift -= 200;

                if (gift>0) {

                    System.out.println("Thank you for your purchase!\n" +
                            "Your current balance is:  " + gift + "$");}

                else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            } else if (thing.equals("Panths")) {

                gift -= 50;

                if (gift>0) {

                    System.out.println("Thank you for your purchase!\n" +
                            "Your current balance is:  " + gift + "$");}

                else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }


            } else if (thing.equals("Pillow")) {

                gift -= 40;

                if (gift>0) {

                    System.out.println("Thank you for your purchase!\n" +
                            "Your current balance is:  " + gift + "$");}

                else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }


            } else if (thing.equals("Smartphone")) {

                gift -= 1000;

                if (gift>0) {

                    System.out.println("Thank you for your purchase!\n" +
                            "Your current balance is:  " + gift + "$");}

                else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }


            } else if (thing.equals("Socks")) {

                gift -= 5;

                if (gift>0) {

                    System.out.println("Thank you for your purchase!\n" +
                            "Your current balance is:  " + gift + "$");}

                else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            } else {

                gift -= 10;

                if (gift>0) {

                    System.out.println("Thank you for your purchase!\n" +
                            "Your current balance is:  " + gift + "$");
                }

                else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            }

        } else {
            System.out.println("Invalid item!");
        }

    }

}





/*Similar to Vending Machine
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants
- 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Cupcake
output: Invalid item!

 */