package tasksfromjavasite;

import java.util.Scanner;

public class FrequencyOfCharsMehmet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the word please: ");

        String str = scan.nextLine();

        String word = "";

        String result = "";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (!word.contains("" + str.charAt(i))) {

                word += str.charAt(i);  // abc yi verecek
            }

        }

        for (int i = 0; i < word.length(); i++) {

            count = 0;  // tekrar sıfırlaması için boyle yaptık.

            for (int j = 0; j < str.length(); j++) {

                if (word.charAt(i) == str.charAt(j)) {

                    count++;
                }

            }
            result += "" + word.charAt(i) + count;

        }
        System.out.println("result = " + result);


    }
}
