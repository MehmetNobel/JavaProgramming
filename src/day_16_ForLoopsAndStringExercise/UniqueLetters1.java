package day_16_ForLoopsAndStringExercise;

public class UniqueLetters1 {

    public static void main(String[] args) {

        String str = "ĞNNKMMHJGFDDZSŞŞŞTTTTURRR";

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            String ch = "" + str.charAt(i);

            if (str.substring(i + 1).contains(ch)||str.substring(0,i).contains(ch)) {

                result += "";
            }else {

                result +=ch;
            }


        }

        System.out.println("str = " + str);

        System.out.println("result = " + result);


    }
}
