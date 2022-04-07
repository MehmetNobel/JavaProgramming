package replit_1.tasks_muhtar;

import java.util.Arrays;
import java.util.Scanner;

public class OuterInner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];

        String result="";
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE
        int k=0;
        for(int s =1; s < sizeOuter-2; s++) {
            if (outer[s]==inner[k])
                result="true";
            else
                result="false";
            k++;
        }

        System.out.println(result);


    }
}
