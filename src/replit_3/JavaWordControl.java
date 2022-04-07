package replit_3;

import java.util.Scanner;

public class JavaWordControl {

    public static void main(String[] args) {

        // boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result="";

        int a=word.length();

        if (a>=3) {

            boolean firstChar=word.substring(0,1).equals("j");

            boolean secondChar=word.substring(1,2).equals("j");


            if(firstChar||secondChar){

                result="true";

            } else {

                result="false";
            }

        }else {

            result= "false";
        }
        System.out.println(result);
    }
}


