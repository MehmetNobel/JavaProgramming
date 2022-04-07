package replit_1.tasks_muhtar;

import java.util.Scanner;

public class EqualNumbers {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        System.out.println("enter the numbers");

        int n1=scan.nextInt();

        int n2=scan.nextInt();

        int n3= scan.nextInt();

        String result =(n1==n2)?"n1=n2":(n1==n3)?"n1=n3":(n2==n3)?"n2=n3":"n1, n2 and n3 are different numbers.";

        System.out.println("result = " + result);







    }
}
