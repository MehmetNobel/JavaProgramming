package z.mehmet;

import java.util.Scanner;

public class ApartmantLeasing {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" enter the number of rooms you request ");

        int room = scan.nextInt();

        if (room > 0 && room <= 3) {

            if (room == 1) {
                System.out.println(room + " bedroom selected");
                System.out.println("price information : " + (room * 1100));
            } else if (room == 2) {
                System.out.println(room + " bedroom selected");
                System.out.println("price information : " + (room * 1100));
            } else {
                System.out.println(room + " bedroom selected");
                System.out.println("price information : " + (room * 1100));
            }
        }else {
            System.out.println("invalid entry..please enter the correct values!");


        }


    }


}
