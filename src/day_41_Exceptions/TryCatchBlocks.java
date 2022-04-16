package day_41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};


        try {

            System.out.println(arr[10]);
        } catch (RuntimeException e) {   // it will be smarter to use runtimeexception rather than just exception class.

            //becasue exception class checks all the checked and unchecked exceptions altogether

            //System.out.println( "an exception was occured");

            e.printStackTrace();   // mostly this type is preferred since contains lots details in it.

            System.out.println(e.getMessage());  // gives just the message to us


        }

        System.out.println("test completed");

        System.out.println("*************************");

        System.out.println("test 3 started");

        try {
            System.out.println("java".substring(2, 0));
        } catch (RuntimeException e) {

            e.printStackTrace();
        }

        System.out.println("test 3 completed");

        System.out.println("cydeo");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");


        try {
            FileInputStream fis=new FileInputStream("file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
