package replit_3;

import java.util.Scanner;

public class AvoidX {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the word");
        String word = scan.next();

        String newWord="";

        int length=word.length();

        boolean first=word.substring(0,1).equalsIgnoreCase("x");

        boolean last=word.substring(length-2,length-1).equalsIgnoreCase("x");

        if (length==1&&first){

            newWord="";
        }else {

            newWord=word;
        }

        if (length==2&&last){

            newWord=word.substring(0,1);
        }else {

            newWord=word;
        }

        if (length==2&&first&&last){

            newWord="";
        }

        if (length>=3) {

            if (first) {

                newWord = word.substring(1, 0);

            } else if (last) {

                newWord = word.substring(0, length - 2);

            } else if (first && last) {

                newWord = word.substring(1, length - 2);

            } else {

                newWord = word;
            }

        }
        System.out.println("old word : "+ word);
        System.out.println("new word: "+ newWord);




    }
}