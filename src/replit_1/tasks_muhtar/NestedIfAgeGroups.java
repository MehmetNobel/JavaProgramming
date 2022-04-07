package replit_1.tasks_muhtar;

import java.util.Scanner;

public class NestedIfAgeGroups {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the age");

        int age = scan.nextInt();

        String result="";
        
        if (age>0&&age<150) {

            if (age<21) {

                result="teenager";

            }else if (age>21&&age<55) {

                result="adult";

            }else {

                result="senior";
            }

        }else {

            result="invalid age";
        }

        System.out.println("result = " + result);
        
    }
}
