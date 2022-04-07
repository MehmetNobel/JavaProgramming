package day_19_LoopPractices;

import java.util.Random;

public class RandomPassword {

    public static void main(String[] args) {

        String str="!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz";

        String str1="";

        /*for (int i = 33; i <=122 ; i++) {

            str +=(char)i;

        }  */

        Random random=new Random();

        for (int i = 1; i <=8 ; i++) {

            int index= random.nextInt(90);

            str1 +=str.charAt(index);

        }

        System.out.println(str1);  // [P;;F@QCP   // B\Ng)KOa   // 2CS?8W^J




    }
}
