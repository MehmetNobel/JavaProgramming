package replit_1;

import java.util.Scanner;

public class Add_Numbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter the first number : ");

        int num1 = scan.nextInt();

        System.out.println("enter the second number : ");

        int num2 = scan.nextInt();

        System.out.println("enter the third number : ");

        int num3 = scan.nextInt();


        int sum=num1+num2+num3;

        System.out.println("Sum of numbers: " + sum);

    }
}
/*In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

Declare integer variables num1, num2, num3, sum.

Create a Scanner object named scan.

Flow:

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"

 */