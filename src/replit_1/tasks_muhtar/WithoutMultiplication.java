package replit_1.tasks_muhtar;

import java.util.Scanner;

public class WithoutMultiplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        int result=0;

        if (n1>0||n2>0) {
            for (int i = 1; i <= n1; i++) {

                result += n2;

            }

            System.out.println("sonuç: "+result);

        }else {
            System.out.println("ınvalid numbers");
        }





    }
}
