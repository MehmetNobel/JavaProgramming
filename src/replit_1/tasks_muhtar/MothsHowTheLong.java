package replit_1.tasks_muhtar;

import java.util.Scanner;

public class MothsHowTheLong {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the month");

        int number = scan.nextInt();

        String result = "";


        switch (number) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:


                result = "31 days";

                break;

            case 2:

                result = "28 days";

                break;


            case 4:
            case 6:
            case 9:
            case 11:

                result = "30 days";

                break;

            default:

                result = "invalid month number";


        }

        System.out.println("result = " + result);

    }
}
