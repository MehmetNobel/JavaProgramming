package replit_1;

import java.util.Scanner;

public class Overdose {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink");

        int number = scan.nextInt();

        int quantity=10000/number;

        System.out.println("It would take about " +quantity+ " drinks for a lethal overdose.");




    }


}
