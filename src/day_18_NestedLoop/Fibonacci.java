package day_18_NestedLoop;

public class Fibonacci {

    public static void main(String[] args) {

        int x=0;

        int y=1;

        for (int i = 0; i <5 ; i++) {

            x=x+y; // x=1 ; x=3; x=8 ; x=21;

            y=x+y; // y=2; y=5  y=13  y=34;

            System.out.println("x = " + x);
            System.out.println("y = " + y);


        }




    }
}
