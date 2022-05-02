package day_41_Exceptions;

public class ExceptionQuizPrep {

    public static void main(String[] args) {
// we have to write catch blocks depending order of exception hierarchy.

        try {
            System.out.println(9/0);
            System.out.println("will u write this");
        } catch (ArithmeticException e){

            e.printStackTrace();
            System.out.println("writing arithmetic exception");
            System.out.println("result from arithmetic= " );

        }

        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("writing nullpointer");
            System.out.println("result from null= " );

        }
        catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("writing runtime");
            System.out.println("result from runtime= " );

        }
       finally {  // regardless of handling exception or not; always gets executed.
            System.out.println("finally");
        }

        int result2=10/5;

        System.out.println("result2 = " + result2);


    }

}
