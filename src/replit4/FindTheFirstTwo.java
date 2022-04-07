/*package replit4;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheFirstTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        if (num.length>=2) {
            int num2[]= Arrays.copyOfRange(num,0,2);
            System.out.println(Arrays.toString(num2));
        }
        else if (num.length==1) {
            int num2[]=Arrays.copyOfRange(num,0,1);
            System.out.println(Arrays.toString(num2));
        }




    }
}



     */
