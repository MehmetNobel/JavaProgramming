package z.mehmet;

import java.util.Scanner;

public class GiftBook {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println(" how many books do u want to purchase?");

        int purcBookNumber= scan.nextInt();

        System.out.println("Are u a premium customer? (true or false)");

        boolean isPremiumCustomer=scan.nextBoolean();

        int freeBookNumber;

        if (isPremiumCustomer) {

            if (purcBookNumber>=5&&purcBookNumber<7) {

                freeBookNumber=1;

                System.out.println("freeBookNumber = " + freeBookNumber);
            } else if (purcBookNumber>=8) {

                freeBookNumber=2;

                System.out.println("freeBookNumber = " + freeBookNumber);
            } else {

                freeBookNumber=0;

                System.out.println("freeBookNumber = " + freeBookNumber);
            }

        }else {
            if (purcBookNumber>=7&&purcBookNumber<12) {

                freeBookNumber=1;

                System.out.println("freeBookNumber = " + freeBookNumber);

            } else if (purcBookNumber>=12) {

                freeBookNumber=2;

                System.out.println("freeBookNumber = " + freeBookNumber);
            } else {

                freeBookNumber=0;

                System.out.println("freeBookNumber = " + freeBookNumber);
            }


        }






    }
}
