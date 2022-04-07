package tasksfromjavasite;

public class TriangleOfNumbers {

    public static void main(String[] args) {


        String result = "*";

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                if (result.length() == 1) {

                    System.out.print("\t  " + result);

                } else if (result.length() == 3) {

                    System.out.print("\t " + result);

                }
            }
                System.out.println();

            }


        }
    }
