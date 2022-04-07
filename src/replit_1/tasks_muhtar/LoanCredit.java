package replit_1.tasks_muhtar;

import java.util.Scanner;

public class LoanCredit {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        System.out.println("enter the scoe");

        int score = scan.nextInt();

        System.out.println("enter the salary");

        int salary=scan.nextInt();

        boolean isLoan=score>=650&&salary>=60000;

        String result ="";

        if (isLoan) {

            result="you can take loan";


        }else {

            result="request rejected";
        }

        System.out.println("result = " + result);

    }
}
