package day_19_LoopPractices;

public class IndexNumberOfFirstUnique {

    public static void main(String[] args) {

        String str = "tzzbbccdddeef";

        String word = "";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    count++;
                }

            }

            if (count == 1) {

                result += "" + str.charAt(i); // first unique character

                System.out.println(str.indexOf(str.charAt(i))); // gives the first unique char' s index.

                System.out.println(result);

                System.exit(0);

            }

        }

        System.out.println(result);


    }
}