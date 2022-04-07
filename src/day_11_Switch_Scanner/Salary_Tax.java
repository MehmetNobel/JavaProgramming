package day_11_Switch_Scanner;

import java.util.Scanner;

public class Salary_Tax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tax=0;

        System.out.println("enter your salary");

        int salary = scan.nextInt();
        System.out.println("are u married");

        boolean isMarried = scan.nextBoolean();

        if (salary < 80000) {

            tax = salary * 0.75;

            if (isMarried) {

                tax = salary * 0.80;}
        }

                if (salary < 100000) {

                    tax = salary * 0.70;

                    if (isMarried) {

                    tax = salary * 0.75;}

                }
        System.out.println("your tax quantity is "+ tax);

            }
        }
