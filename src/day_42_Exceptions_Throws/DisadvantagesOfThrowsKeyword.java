package day_42_Exceptions_Throws;

public class DisadvantagesOfThrowsKeyword {


    public static void sleepExampleMethod() throws InterruptedException{

        Thread.sleep(2000);
    }

    public static void main(String[] args) {

        // sleepExampleMethod();

        // when we call it in another method then it again gives error.
        // because it carries the exception with itself to the other method.

    }
}
