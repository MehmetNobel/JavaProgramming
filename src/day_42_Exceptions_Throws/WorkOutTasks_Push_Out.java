package day_42_Exceptions_Throws;

public class WorkOutTasks_Push_Out {

    public static void main(String[] args) {

        System.out.println("push up started");

        for (int i = 1; i <=50; i++) {

            System.out.print("\rpush up "+i);

            try{
                Thread.sleep(150);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println();
        System.out.println("push up finished");



    }
}
