package replit_1.tasks_muhtar;

import java.util.Scanner;

public class ConvertingNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number");

        int number = scan.nextInt();

        String result=(number==1)?"One":(number==2)?"two":(number==3)?"three":(number==4)?"four"
                :(number==5)?"five":(number==6)?"six":(number==7)?"seven":(number==8)?"eight":(number==9)
                ?"nine":"ten";

        System.out.println("result = " + result);




    }

}
