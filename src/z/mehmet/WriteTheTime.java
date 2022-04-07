package z.mehmet;

import java.util.Scanner;

public class WriteTheTime {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the hour info : ");

        int hour = scan.nextInt();

        System.out.println("enter the minute info : ");

        int minute = scan.nextInt();

        System.out.println("enter the second info : ");

        int second = scan.nextInt();


        scan.nextLine();

        System.out.println("enter the am/pm info : ");

        String amOrPm = scan.nextLine();

        System.out.println("TIME IS : " +hour+":"+minute+":"+second+" "+amOrPm);


    }


}



