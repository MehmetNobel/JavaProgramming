package replit_1.tasks_muhtar;

import java.util.Scanner;

public class SalaryTaxRateProgram {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        System.out.println("enter your salary");

        double totalSalary = scan.nextDouble();

        double taxeRate=0;

        System.out.println("are you married?");

        boolean isMarried= scan.nextBoolean();

        if (totalSalary>=130) {

            taxeRate =0.35;
        }else if (totalSalary>=100) {

            taxeRate=0.30;
        } else if (totalSalary>=80) {

            taxeRate=0.25;
        }else if (totalSalary<80) {

            taxeRate=0.20;
        }


        if (isMarried) {

            taxeRate -=0.05;
        }

        double afterTaxSalaray=totalSalary-(totalSalary*taxeRate);
        System.out.println("totalSalary = " + totalSalary);
        System.out.println("afterTaxSalaray = " + afterTaxSalaray);

    }
}
