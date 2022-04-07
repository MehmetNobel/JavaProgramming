package day_19_LoopPractices;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double stateTaxRate = 0.26;

        while (true) {

            System.out.println("how much do make an hour?");

            double hourSalary = scan.nextDouble();

            if (hourSalary <= 0) {
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");

            int weeklyHours = scan.nextInt();

            if (weeklyHours < 1 && weeklyHours > 144) {

                System.err.println("Invalid Entry for weekly hours");
                System.exit(0);
            }

            System.out.println("Enter the federal tax rate?");

            double fedtaxRate = scan.nextDouble();

            if (fedtaxRate < 0 && fedtaxRate > 0.10) {

                System.err.println("Invalid Entry for TAXRATE");
                System.exit(0);
            }

            double totalSalary = hourSalary * weeklyHours * 52;

            double stateTax = totalSalary * stateTaxRate;

            double fedaralTax = totalSalary * fedtaxRate;

            double netIncome = totalSalary - stateTax - fedaralTax;

            System.out.println("totalSalary = " + totalSalary);
            System.out.println("stateTax = " + stateTax);
            System.out.println("fedaralTax = " + fedaralTax);
            System.out.println("netIncome = " + netIncome);

            System.out.println("would you like to go on");

            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

                System.err.println("invalid answer!!");

                System.exit(0);
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                System.exit(0);
            }
        }
    }
}
/*
5. Write a program for the salary calculator
1. Ask the user "How much you make an hour?"
If user entered hourlyRate
is 0 or negative, terminate the program after displaying the error message
"Invalid Entry for Hourly Rate"
2. Ask the user  "How many hours do you work
per week?"
if user entered weeklyHour
is less than 1 or greater than 144, terminate the program after displaying
the error message "Invalid Entry for Weekly Hours"
3. Ask the user  "Enter your state tax rate"
if the state tax rate is
less than 0% or greater than 10%, terminate the program after displaying
the error message "Invalid Entry for state tax Rate"
4. Display:
1. Gross Salary
2. Federal Tax (assume that
federal tax rate is 26%)
3. State Tax
4. Total Tax
5. Net Income
5. Ask the user "Would you like to continue?"
If "yes" --> repeat all the previous
steps
If "no" --> print "Thank you for using
Cydeo Salary Calculator APP"
If user enters an invalid entry,
terminate the program after displaying the error message "Invalid Entry"

 */