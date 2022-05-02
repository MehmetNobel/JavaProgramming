package day_41_Exceptions;

public class ExceptionQuizPrep2 {

    public static void main(String[] args) {

        System.out.println("hello");

        try {

            throw new RuntimeException("wrong calculation");  // we must catch the exception within try catch block; otherwise
            //we cant access the following lines.

        }catch (RuntimeException e){

            System.out.println("hello 2");
        }


        System.out.println("hello 3");

        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("caught-1");
            e.printStackTrace();
        }
        System.out.println("caught-2");

         */

    }
}
