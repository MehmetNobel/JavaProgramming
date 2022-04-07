package day_15_ForLoop.day_17_DoWhileLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String result = "";

        String answer = "";

        //!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")



        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

            System.out.println("do u want to reserve a room?");

            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("yes")) {

                System.out.println("how do you want your room");

                String room = scan.nextLine();

                if (room.equalsIgnoreCase("King Bed")) {
                    result += "120$";

                } else if (room.equalsIgnoreCase("Queen Bed")) {
                    result += "100$";

                } else if (room.equalsIgnoreCase("Single Bed")) {
                    result += "120$";

                } else {

                    while (!(room.equalsIgnoreCase("King Bed")||
                            room.equalsIgnoreCase("Queen Bed")||
                            room.equalsIgnoreCase("Single Bed"))) {

                        System.out.println("how do you want your room");

                         room = scan.nextLine();

                        if (room.equalsIgnoreCase("King Bed")) {
                            result += "120$";break;

                        } else if (room.equalsIgnoreCase("Queen Bed")) {
                            result += "100$";break;

                        } else if (room.equalsIgnoreCase("Single Bed")) {
                            result += "120$";
                            break;

                        }
                    }

                }
            }

            if (answer.equalsIgnoreCase("no")) {

                result = "have a nice day";

            }
        }
        System.out.println("result : " + result);
    }


}

