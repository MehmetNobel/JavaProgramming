package day_24_CustomMethodReturn;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {


        String str[]= new String[]{"Ahmet","ayşe","esad","zeynep"};

        System.out.println(Arrays.toString(str));

        System.out.println(str[0]);

        String result="";

        int array[]=new int[]{1,2,3,4};

        for (int i = 0; i < str.length ; i++) {

            result =str[i]+"==>"+array[i];

            System.out.println(result);

        }


        for (int i : array) {

            if (i>2&&i<=3)
                System.out.println(i);

        }



    }
}
