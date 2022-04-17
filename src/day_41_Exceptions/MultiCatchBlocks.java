package day_41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        try {
            System.out.println("\"java\".charAt(-1) = " + "java".charAt(-1));

        } catch (ClassCastException e) {
            System.out.println("exception is caught:class castexception");
            e.printStackTrace();
        }
        catch (NullPointerException e) {
            System.out.println("exception is caught: nullpointer");
            e.printStackTrace();
        }
        catch (RuntimeException e) {            // at the end of the this will catch the exception. because it is parent of all exceptions.
            System.out.println("exception is caught: runtime");
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("path");
        }catch (FileNotFoundException e){

            e.printStackTrace();
            System.out.println("this is the exception codes details of fis");
        }



    }
}
