package day_18_NestedLoop;

public class MultiplicationTable {

    public static void main(String[] args) {

        String result = "";

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                result = "" + (j * i);

                if (result.length() <= 1) {

                    System.out.print(result + "  ");

                } else if (result.length() <= 3) {

                    System.out.print(result + " ");
                }


            }

            System.out.println();

        }
    }
}