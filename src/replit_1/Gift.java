package replit_1;

import java.util.Scanner;

public class Gift {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //  System.out.println("what do u want to buy :");

        String thing = scan.nextLine();

        int gift = 100;

        //Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$
        // Smartphone - 1000$ Socks - 5$ USB cable - 10$


        if (thing.equals("Blanket") || thing.equals("Charger") || thing.equals("Hat") || thing.equals("Headphones")
                || thing.equals("Laptop")
                || thing.equals("Pants") || thing.equals("Pillow") || thing.equals("Smartphone") || thing.equals("Socks")
                || thing.equals("USB Cable")) {

            if (thing.equals("Blanket")) {

                gift -= 60;

                System.out.println("Thank you for your purchase!\nYour current balance is: " + gift + "$");
            }


         else if (thing.equals("Charger")) {

            gift -= 25;

            System.out.println("Thank you for your purchase!\nYour current balance is: " + gift + "$");

        } else if (thing.equals("Hat")) {

            gift -= 25;

            System.out.println("Thank you for your purchase!\nYour current balance is: " + gift + "$");

        } else if (thing.equals("Headphones")) {

            gift -= 30;

            System.out.println("Thank you for your purchase!\nYour current balance is: " + gift + "$");

        } else if (thing.equals("Laptop")) {

            gift -= 200;

            System.out.println("Sorry, not enough funds on your gift card!");


        } else if (thing.equals("Pants")) {

            gift -= 50;

            System.out.println("Thank you for your purchase!\nYour current balance is: " + gift + "$");


        } else if (thing.equals("Pillow")) {

            gift -= 40;

            System.out.println("Thank you for your purchase!\nYour current balance is: " + gift + "$");

        } else if (thing.equals("Smartphone")) {

            gift -= 1000;

            System.out.println("Sorry, not enough funds on your gift card!");

        } else if (thing.equals("Socks")) {

            gift -= 5;

            System.out.println("Thank you for your purchase!\nYour current balance is: " + gift + "$");

        } else if (thing.equals("USB cable")) {

            gift -= 10;

            System.out.println("Thank you for your purchase!\nYour current balance is: " + gift + "$");


        }
    }
    else

    {
        System.out.println("Invalid item!");
    }

}

}







