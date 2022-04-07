package tasksfromjavasite;

import java.util.Scanner;

public class Pyramid1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num= scan.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = num; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(j+"");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}
/*
        1
       212
      32123
     4321234
    543212345
 */