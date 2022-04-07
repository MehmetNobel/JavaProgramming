package tasksfromjavasite;

import java.util.Scanner;

public class FrequencyOfChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        String word = "";

        String result="";

        for (int i = 0; i < str.length(); i++) {
            if (!word.contains(str.charAt(i) + "")) {
                word += str.charAt(i);
            }


        }
        System.out.println("word = " + word);

        for (int i = 0; i < word.length(); i++) {
            int freq = 0;
            for (int j = 0; j < str.length(); j++) {
                if (word.charAt(i) == str.charAt(j)) {
                    freq++;
                }
            }
            result += "" + word.charAt(i) + freq;

        }
        System.out.println("result = " + result);
    }
}