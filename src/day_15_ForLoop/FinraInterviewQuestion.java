package day_15_ForLoop;

public class FinraInterviewQuestion {

    public static void main(String[] args) {

        //write a program that while divided by 3 gives fin;
        // while divided by 5 gives ra and while divided both (3 and 5) finra
        //ex:
        // 1 2 fın 4 ra fin 7 8 fin ra 11 fin 13 14 finra

        for (int i = 1; i <= 100;) {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("finra");i++;
            } else if (i % 5 == 0) {
                System.out.print("ra");i++;
            } else if (i % 3 == 0) {
                System.out.print("fin");i++;
            }

            System.out.print(i);

            i++;

        }


      /*  System.out.println();

        System.out.println("*******************************");


        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " ");

        }

        for (int i = 65; i <= 90; i++) {

            System.out.print((char) i + " ");

        }*/


    }
}
