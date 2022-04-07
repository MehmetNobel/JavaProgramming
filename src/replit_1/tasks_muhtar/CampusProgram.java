package replit_1.tasks_muhtar;

import java.util.Scanner;

public class CampusProgram {

    public static void main(String[] args) {


        Scanner scan =new Scanner (System.in);

        System.out.println("enter the time");

        int time = scan.nextInt();

        boolean isOpen=time>=8&&time<=23;

        String result ="";

        if (isOpen) {

            result =" campus is open now";
        }else {

            result ="campus is not closed now, sorry";
        }

        System.out.println("result = " + result);


    }
}
