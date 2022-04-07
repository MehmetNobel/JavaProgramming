package replit4;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");
        Arrays.sort(words);

        int min = words[0].length();
        String output = "";

        for (String each : words){

            if (min > each.length()){
                output = each + " ";
                min=each.length();
            }else if (min==each.length()){
                output+=each + " ";
            }
        }

        String[] result = output.trim().split(" ");
        System.out.println(Arrays.toString(result));
    }
}