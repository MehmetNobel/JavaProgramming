package day_42_Exceptions_Throws;


import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {


        throw new NoSuchElementException("this is an example of nosuchhelementexception");

        //we cannot reach the following codes after the throw keyword.

        // we create exception explicitly see the problem over there.

        //we can only write the classes // contructors that has is a relation with THROWABLE parent class.


    }
}
