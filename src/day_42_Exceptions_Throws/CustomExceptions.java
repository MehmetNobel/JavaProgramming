package day_42_Exceptions_Throws;

class Mehmet extends RuntimeException {   // we create our own custom unchecked exception class here.

    public Mehmet(String message) {

        super(message);

    }
    // here we are overloading the method.
    public Mehmet(){

        super("it is time for lunch break");
    }

}


class Ahmet extends Exception{

    public Ahmet(){
        super("this is a checked exception");

    }



}

public class CustomExceptions {

    public static void main(String[] args) {

        //throw new Mehmet("this is mehmets exception");   unchecked exception

        //throw new Mehmet();   unchecked exception

        try {                           // checked exception example
            throw new Ahmet();
        } catch (Ahmet e) {
            e.printStackTrace();
        }


    }
}
