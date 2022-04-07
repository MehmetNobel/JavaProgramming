package replit4;

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter the day number");

        int day = scan.nextInt();

        String result = "";

        switch (day) {

            case 1:
                result = "monday";
                break;
            case 2:
                result = "tuesday";
                break;
            case 3:
                result = "wednesday";
                break;
            case 4:
                result = "thursday";
                break;
            case 5:
                result = "friday";
                break;
            case 6:
                result = "saturday";
                break;
            case 7:
                result = "sunday";
                break;
            default:
                result = "invalid number";

        }

        System.out.println("result = " + result);
    }
}
