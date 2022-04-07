package day_20_Arrays;

import java.util.Arrays;

public class Alpabet {

    public static void main(String[] args) {


        char ch='Z';

        char letters[]=new char[26];

      /*  for (int i = 0; i < letters.length ; i++) {

            letters[i]=ch;

            ch--;

        }

        System.out.println(Arrays.toString(letters));

        char ch3=65;   //  A harfini veriyor.

        System.out.println("ch3 = " + ch3);*/


        for( char i=0, j='Z'; i< letters.length; i++,j--){

            letters[i]=j;
        }

        System.out.println(Arrays.toString(letters));
    }
}
