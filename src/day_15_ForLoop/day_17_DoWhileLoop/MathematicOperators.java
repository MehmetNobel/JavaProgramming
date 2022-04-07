package day_15_ForLoop.day_17_DoWhileLoop;

import java.util.Scanner;

public class MathematicOperators {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter the first number");

        int n1=scan.nextInt();

        System.out.println("enter the second number");

        int n2=scan.nextInt();

        String result="";

        System.out.println("please the math operator:");

        char op=scan.next().charAt(0);

        switch (op) {

            case '+':
                result =""+(n1+n2);
                break;
            case '-':
                result =""+(n1-n2);
                break;
            case '*':
                result =""+(n1*n2);
                break;
            case '/':
                result =""+(n1/n2);
                break;
            default:
               result ="please enter valid operator! ";

        }
        System.out.println("result :" + result);





    }
}
