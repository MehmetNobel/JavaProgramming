package day_42_Exceptions_Throws;

public class SleepMethod_WorkOutTasks_Push_Out {

    public static void sleep(double seconds) {  // we create sleep method ourselves.to escape frem explicit calling of thread.sleep.
        try {
            Thread.sleep((long)(seconds * 1000));

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        System.out.println("push up started");

        for (int i = 1; i <= 25; i++) {

            System.out.print("\rpush up " + i);   // \r => rewrites the same sentence.
            // make sure that u must write print not println!!

          sleep(0.25);

        }
        System.out.println();
        System.out.println("push up finished");

        System.out.println("pull up started");

        for (int i = 1; i <= 25; i++) {

            System.out.print("\rpull up " + i);   // \r => rewrites the same sentence.
            // make sure that u must write print not println!!

          sleep(0.25);

        }
        System.out.println();
        System.out.println("pull up finished");


    }
}
