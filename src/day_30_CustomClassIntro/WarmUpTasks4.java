package day_30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks4 {

    public static void main(String[] args) {


        String str="hdkshgkdfg322465465%%&&&////";

        ArrayList<Character> chars=new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
        }

        System.out.println("chars = " + chars);
        ArrayList<Character> digits=new ArrayList<>(chars);
        //chars.removeIf(p->(Character.isDigit(p)||Character.isLetter(p)));
        digits.removeIf(p->(!Character.isDigit(p)));
        System.out.println("digits = " + digits);

        ArrayList<Character> letters=new ArrayList<>(chars);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println("letters = " + letters);

        ArrayList<Character> specialchars=new ArrayList<>(chars);
        specialchars.removeIf(p-> (Character.isLetter(p)||Character.isDigit(p)));
        System.out.println("specialchars = " + specialchars);


    }




}
