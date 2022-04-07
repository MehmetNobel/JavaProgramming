package day_15_ForLoop.day_17_DoWhileLoop;

public class DivisionBy5By10By15 {

    public static void main(String[] args) {

        int n1=100;

        String result15="";
        String result5="";
        String result3="";

        for (int i = 0; i <=n1 ; i++) {

            if (i%15==0) {
                result15 +=i+" ";
            }

            if (i%5==0&&i%15!=0) {
                result5 +=i+" ";
            }

            if (i%3==0&&i%15!=0) {
                result3 +=i+" ";
            }

        }
        System.out.println("result3 = " + result3 );
        System.out.println("result5 = " + result5);
        System.out.println("result15 = " + result15);





    }
}
