package day_42_Exceptions_Throws;

public class ExceptionExample {

    public static void main(String[] args){

        try{

            System.out.println(9/0);
        }catch (RuntimeException e){

            e.printStackTrace();
            System.out.println("exception handled");
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println( "hello");


    }




}
