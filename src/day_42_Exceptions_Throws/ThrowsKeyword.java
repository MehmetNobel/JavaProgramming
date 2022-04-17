package day_42_Exceptions_Throws;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("test 1 started");

        System.out.println("hello");

        Thread.sleep(1000);

        System.out.println("cydeo");

        Thread.sleep(1000);

        System.out.println("hello");

        Thread.sleep(1000);

        System.out.println("eu8");








        System.out.println("test 1 started");

        System.out.println("hello");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("cydeo");

        System.out.println("test finished");

        System.out.println("hello");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("EU8");


    }
}
