package replit4;

import java.util.Scanner;

public class Diving {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        float sum = 0;

        float score1 = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.println("Please enter score for judge");
            score[i] = input.nextFloat();
            sum += score[i];

        }
        System.out.println("Please enter the diffuculty");

        float dif = input.nextFloat();

        score1 = sum *dif;

        double total=score1*0.6;

        // FINAL OUTPUT
        System.out.printf("Total: %.2f",total);


    }




}
