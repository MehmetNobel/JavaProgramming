package day_19_LoopPractices;

public class HighestFrequency {

    public static void main(String[] args) {


        String str = "aabbbccczzzzzzzzzzzzzzzzzzzzzzzzddddddddddef";

        String word = "";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!word.contains("" + str.charAt(i))) {
                word += str.charAt(i);
            }

        }


        int count1 = 0;

        for (int i = 0; i < word.length(); i++) {

           int countTemp=0;


            for (int j = 0; j < str.length(); j++) {

                if (word.charAt(i) == str.charAt(j)) {
                    countTemp++;
                }
                if (count1 <= countTemp) {

                    count1=countTemp;

                    result = "" + word.charAt(i);
                }
            }

        }
        System.out.print(result);
    }
}