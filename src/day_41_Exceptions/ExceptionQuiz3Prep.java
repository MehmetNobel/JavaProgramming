package day_41_Exceptions;

import java.util.Locale;

public class ExceptionQuiz3Prep {

    public static void main(String[] args) {


        for (int i = 1; i <=15 ; i++) {

            System.out.print("\rpush up " + i);

            try {

                Thread.sleep(500);
            }catch(InterruptedException e){

                //e.getMessage();
            }


        }



        /*String str = "ahmet";

        System.out.println(str.toUpperCase());

        try{

            Thread.sleep(2000);
        }catch (InterruptedException e){

            e.printStackTrace();
            //System.out.println("ahmet");
        }

        System.out.println("mehmet");

         */








       /* try {

            System.out.println(9 / 0);

            System.out.println("deneme");  // this text will not be writtten
        } catch (NullPointerException e) {

            e.printStackTrace();
            System.out.println("a1");
        }

        //System.out.println("a2");

        finally{

        }


        */


    }
}
