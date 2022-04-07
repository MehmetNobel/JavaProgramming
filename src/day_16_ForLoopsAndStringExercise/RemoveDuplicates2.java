package day_16_ForLoopsAndStringExercise;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        String str = "AAAAABBBBBCCCCCDDDDDFFFF";

        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {

            String ch = ""+str.charAt(i);

            if (!result.contains(ch)) {

                result += ch;

            }


        }

        System.out.println("str = " + str);
        System.out.println("result = " + result);


    }
}
