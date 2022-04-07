package day_18_NestedLoop;

import java.util.Scanner;

public class InterviewQuestionaa2bbb3cc2d1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("type the text which you want to find frequency of letters");
        String text = input.nextLine();
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }
            result = "" + text.charAt(i) + count;
            text = text.replace(("" + text.charAt(i)), "");
            System.out.print(result);
        }
    }
}