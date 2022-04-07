package replit_1;

import java.util.Scanner;

public class SecondConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter seconds:");

        int seconds = scan.nextInt();

        int hour = (seconds / 3600);

        int minutes = (seconds - (hour * 3600)) / 60;

        int sec = (seconds - ((hour * 3600) + (minutes * 60)));

        String result =hour+" hours, "+minutes+ " minutes, and "+sec+" seconds";

        System.out.println("result = " + result);


    }
}
