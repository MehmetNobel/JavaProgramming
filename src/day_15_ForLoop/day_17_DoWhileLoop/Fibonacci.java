package day_15_ForLoop.day_17_DoWhileLoop;

public class Fibonacci {

    public static void main(String[] args) {

        int x = 0;

        int y = 1;

        for (int i = 0; i < 5; i++) {

            x = x + y;

            y = x + y;

            System.out.print(x +" ");
            System.out.print(y + " ");


        }


    }
}
