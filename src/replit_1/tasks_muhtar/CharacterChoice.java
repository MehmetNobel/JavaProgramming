package replit_1.tasks_muhtar;

import java.util.Scanner;

public class CharacterChoice {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        System.out.println("enter the character");

        String ch= scan.next();

        String result="";

        ch=ch.toLowerCase();

        char chr=ch.charAt(0);

        if (chr>='a'&&chr<='z') {

            result ="alphabetic character";

        } else if (chr>=1&&chr<=9) {

            result="digit character";
        }else {

            result ="special character";
        }


        System.out.println("result = " + result);

    }
}
