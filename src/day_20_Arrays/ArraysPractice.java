package day_20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {


        /*String months[] = {"Jan", "feb", "march", "april", "may", "june", "july",
                "august", "september", "october", "nov", "december"};

        for (int i = months.length - 1; i >= 0; i--) {

            System.out.print(months[i] + " ");

        }

        System.out.println(months.length);

        System.out.println(" ===================");*/


        /*char ch1 = 'A';

        char letters[] = new char[26];

        for (int j = 0; j <letters.length; j++) {

            letters[j] = ch1;
            ch1++;
        }

        System.out.println(Arrays.toString(letters));

         */

        char letters[] = new char[26];

        char ch2 = 'Z';
        for (int i = 0; i <letters.length ; i++) {

            letters[i]=ch2;

            ch2--;

        }
        System.out.println(Arrays.toString(letters));





    }


}

