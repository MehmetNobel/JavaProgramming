package replit_1.tasks_muhtar;

import java.util.Arrays;

public class Day_21_task {

    public static void main(String[] args) {


        String str = "java java ahmet mehmet ali hasan pyhton java pyhton";

        String strArr[] = str.split(" ");

        String strReversed[] = new String[strArr.length];

        System.out.println(Arrays.toString(strArr));

        String reversed = "";

        int k = 0;

        for (String s : strArr) {


            for (int i = s.length() - 1; i >= 0; i--) {

                reversed += "" + s.charAt(i);

            }
            reversed += " ";

            k++;

        }

        strReversed = reversed.split(" ");
        System.out.println(Arrays.toString(strReversed));





        /*int countJava = 0;
        int countPyhton = 0;

        for (String s : strArr) {

            if (s.equals("java"))

                countJava++;

            if (s.equals("pyhton"))

                countPyhton++;

        }

        System.out.println("countPyhton = " + countPyhton);

        System.out.println("countJava = " + countJava);

         */


    }


}
/*
6. Write a program that can return the number of appearances of
âjavaâ and âpythonâ anywhere in the sentence.
(similar to the task 97 in repl.it, but
this time you MUST use arrays and for each loop)
 */