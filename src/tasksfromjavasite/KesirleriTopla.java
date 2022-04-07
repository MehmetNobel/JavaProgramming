package tasksfromjavasite;

import java.util.Scanner;

public class KesirleriTopla {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double sum=0;

        System.out.println("please enter the n value");

        int n = scan.nextInt();

        for (int i = 1; i <=n ; i++) {

           sum+=1.0/i;  // sağ tarafın double olması için 1 yerine 1.0 yazdık..

        }
        System.out.println("sum = " + sum);




    }
}
