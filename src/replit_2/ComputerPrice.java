package replit_2;

import java.util.Scanner;

public class ComputerPrice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double computerprice = 0;

        System.out.println("Select screen size:");

        double screensize = scan.nextDouble();

        if (screensize == 13.3) {

            computerprice += 200;

        } else if (screensize == 15.0) {

            computerprice += 300;

        } else if (screensize == 17.3) {

            computerprice += 400;
        }
        scan.nextLine();

        System.out.println("Select CPU type:");

        String cpu = scan.nextLine();

        if (cpu.equals("i3")) {

            computerprice += 150;

        } else if (cpu.equals("i5")) {

            computerprice += 250;

        } else if (cpu.equals("i7")) {

            computerprice += 350;
        }

        System.out.println("Select RAM size:");

        int ram = scan.nextInt();

        int ramk = ram / 4;

        computerprice = computerprice + (ramk * 50);


        scan.nextLine();

        System.out.println("Select storage type:");

        String storage = scan.nextLine();

        System.out.println("Enter memory size:");

        int memory = scan.nextInt();

        int memoryk = memory / 500;

        if (storage.equals("HDD")) {

            computerprice += memoryk * 50;

        } else if (storage.equals("SSD")) {

            computerprice += memoryk * 100;

        }

        scan.nextLine();

        System.out.println("Enter screen resolution:");

        String screenres = scan.nextLine();

        if (screenres.equals("FULLHD")) {

            computerprice += 100;
        } else if (screenres.equals("4K")) {

            computerprice += 200;
        }

        System.out.println("Laptop price is:$" + computerprice);

    }
}