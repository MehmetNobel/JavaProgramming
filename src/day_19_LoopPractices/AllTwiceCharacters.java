package day_19_LoopPractices;

public class AllTwiceCharacters {

    public static void main(String[] args) {

        String str = "azzbbcccdddeef";

        String word = "";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    count++;
                }

            }

            if (count == 2) {

                result += "" + str.charAt(i);

                //System.out.println(str.indexOf(str.charAt(i))); // gives the duplicate char s index.

            }

        }

        System.out.println(result);


    }
}
