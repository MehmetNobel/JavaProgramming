package z;

public class MinNumber {

    public static void main(String[] args) {

        int num1=50, num2=50;

        boolean result1=num1<num2;
        boolean result2=num2<num1;
        boolean result3=num1==num2;

        if(result1) {

            System.out.println("num1 is the min number = " + num1);
        }

        if(result2) {

            System.out.println("num2 is the min number = " + num2);
        }

        if(result3) {

            System.out.println("num1 and num2 equal = " + num1+" = "+num2);
        }




    }
}
