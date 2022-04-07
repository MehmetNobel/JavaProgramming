package day_18_NestedLoop;

import java.util.Scanner;

public class RoomReservation2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;

        while (true) {

            String rooms = "King Bed ==> 120$\n" +
                    "Queen Bed ==> 100$\n" +
                    "single Bed ==> 80$";

            System.out.println(rooms);

            System.out.println("which room do you prefer");

            String room = scan.nextLine();

            System.out.println("how many nights will u stay");

            int nights = scan.nextInt();

            if (room.equalsIgnoreCase("King Bed")) {

                total += nights * 120;
            }else if (room.equalsIgnoreCase("Queen Bed")) {

                total += nights * 100;
            } else if (room.equalsIgnoreCase("Single Bed")) {

                total += nights * 80;
            }

            System.out.println("would you like to reserve another room?");

            String answer = scan.next().toLowerCase();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

                System.err.println("would you please enter a valid answer? ex: yes or no");

                answer = scan.next().toLowerCase();

                scan.nextLine();

            }

            if (answer.equalsIgnoreCase("no")) {

                break;
            }
        }

        System.out.println("total cost is : "+ total);


    }
}
