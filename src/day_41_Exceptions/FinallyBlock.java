package day_41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int arr[]={1,2,3};

        try{
            System.out.println(arr[1]);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }finally {                      // finally block it is always gets executed, regardless of the exceptions occurs or not
            System.out.println("this is finally block");
        }


    }
}
