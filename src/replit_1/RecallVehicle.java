package replit_1;

import java.util.Scanner;

public class RecallVehicle {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter vehicle's year:");

        int vehicleYear = scan.nextInt();

        String result = " ";


        switch (vehicleYear) {

            case 1995:
            case 1996:
            case 1997:
            case 1998:

            case 2001:
            case 2002:
            case 2004:
            case 2005:

            case 2006:
            case 2015:
            case 2016:
            case 2017:

                result = "Your vehicle needs to be recalled!";

                break;

            default:

                result = "Your vehicle is fine, enjoy!";

        }

        System.out.println(result);
    }


}
