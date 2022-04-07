package day_21_Arrays2ForEach;

import java.util.Arrays;

public class NewDeclarationTypeForArrays {

    public static void main(String[] args) {


        String str[]=new String[]{"ahmet","ayse","esad","zeynep"};

        int num[]=new int[]{1,2,3,4};

        System.out.println(Arrays.toString(str));

        System.out.println(Arrays.toString(num));

        System.out.println("**********************");

        for (String s : str) {   // write iter + hit the enter

            System.out.println(s);

        }

      

    }
}
