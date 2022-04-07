package day_12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter the full name:");

        String fullName=scan.nextLine();

        System.out.println("enter the building number:");

        String bnumber=scan.next();

        scan.nextLine();

        System.out.println("enter the Street name:");

        String streetName=scan.nextLine();

        System.out.println("enter the city name:");

        String cityName=scan.nextLine();

        System.out.println("enter the state name:");

        String stateName=scan.nextLine();

        System.out.println("enter the zip code:");

        int zipCode=scan.nextInt();

        System.out.println("zipCode = " + zipCode);

        System.out.println("stateName = " + stateName);

        System.out.println("cityName = " + cityName);

        System.out.println("streetName = " + streetName);

        System.out.println("bnumber = " + bnumber);

        System.out.println("fullName = " + fullName);



    }
}
