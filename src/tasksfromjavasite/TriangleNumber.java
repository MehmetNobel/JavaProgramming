package tasksfromjavasite;

public class TriangleNumber {

    public static void main(String[] args) {

        int a = 1;

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1) {

                    System.out.print(a + "\t");
                }

                a++;

                if (j >= 2) {

                    for (int k = 1; k <= j; k++) {

                        System.out.print(a + "\t");
                    }
                }


            }

            System.out.println();

        }


    }


}

