package day_41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int arr[]={1,2,3};

        try{
            System.out.println(arr[1]);
        } catch (RuntimeException e) {
            e.printStackTrace();
            //System.exit(0);  ıf we wanna explicitly terminate the program before finally block then we must use System.Exit(0) method.
        }finally {                      // finally block it is always gets executed, regardless of the exceptions occurs or not
            System.out.println("this is finally block");
        }


    }
}
