package replit4;

import java.util.Scanner;

public class GuestList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // your code
        // ------------------------------------------
        String answer="yes";

        String list="";

        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("Please enter guest name:");

            String name=input.next();

            list +=name+" ,";

            System.out.println("Do you want to enter new guest name:");

            answer=input.next();


        }

        list=list.substring(0,list.lastIndexOf(',')).trim();

        System.out.println("Guest's list: " + list);


    }
}