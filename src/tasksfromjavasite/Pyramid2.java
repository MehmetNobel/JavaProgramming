package tasksfromjavasite;

public class Pyramid2 {

    public static void main(String[] args) {

        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(i);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
 /*

        1
       222
      33333
     4444444
    555555555

  */
