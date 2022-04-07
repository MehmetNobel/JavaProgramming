package day_21_Arrays2ForEach;

import java.util.Scanner;

public class FindAverageNumber {

    public static void main(String[] args) {

        int temps[]={10,20,30,40,50};

        int sum=0;

        for (int temp : temps) {

            sum+=temp;

        }

        System.out.println("sum = " + sum);

        Scanner scan=new Scanner(System.in);

        System.out.println("enter the size");


        int size= scan.nextInt();

        int nums[]=new int[size];
        for (int i = 0; i < size; i++) {

            nums[i]= scan.nextInt();

        }

        for (int num : nums) {

            System.out.println(num);

        }




    }
}
