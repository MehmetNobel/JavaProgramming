package day_30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask2 {

    public static void main(String[] args) {


        String str="ABFJHGJ86826@%&//(()245464";

        char ch[]=str.toCharArray();

        String st[]=str.split("");

        System.out.println("st = " + Arrays.toString(st));
        System.out.println("ch = " + Arrays.toString(ch));

        int sum=0;

        ArrayList<String> digits=new ArrayList<>();
        ArrayList<String> letters=new ArrayList<>();
        ArrayList<String> specialChars=new ArrayList<>();

        for (int i = 0; i < ch.length ; i++) {

            if(Character.isDigit(ch[i])) {
                digits.add(ch[i] + "");
                sum += Integer.parseInt(ch[i]+"");
            }
            else if(Character.isLetter(ch[i]))
                letters.add(ch[i]+"");
            else
                specialChars.add(ch[i]+"");

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
        System.out.println("sum = " + sum);


    }
}
