package z.mehmet;

import java.util.Scanner;

public class ZombiAttack {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number of zombi  : ");

        int in=scan.nextInt();

        int day=0;

        while (in>0) {

            in=in/2;

              day++;

            System.out.println(day + ". gündeki inh sayısı : " + in);

        }

        System.out.println("day = " + day);
        System.out.println("in = " + in);







    }
}
