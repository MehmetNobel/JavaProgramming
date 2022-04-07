package day_15_ForLoop.day_17_DoWhileLoop;

public class EvenNumbersWithContinue {

    public static void main(String[] args) {

        for (int i = 0; i <=10 ; i++) {

            if (i%2==1){
                continue;  // increase the iteration; goes back to beginning of the loop
            }

            System.out.print(i);

        }


        System.out.println();

        for (int i = 0; i <=10 ; i++) {

            if (i%2==0){
                continue;  // increase the iteration; goes back to beginning of the loop
            }

            System.out.print(i);

        }



    }
}
