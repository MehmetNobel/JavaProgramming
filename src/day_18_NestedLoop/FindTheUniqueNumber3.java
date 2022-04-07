package day_18_NestedLoop;

import java.util.Scanner;

public class FindTheUniqueNumber3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("type the text");
        String word = input.nextLine();//aliveli
        String result = "";
        for (int j = 0; j < word.length(); j++) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(j) == word.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                result += word.charAt(j);
            }
        }
        System.out.println(result);
    }
}






