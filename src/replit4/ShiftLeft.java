package replit4;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int numsShifted[] = new int[size];
        int k = 1;
        for (int j = 0; j < numsShifted.length; j++) {
            if (j == numsShifted.length - 1) {
                numsShifted[j] = nums[0];
                break;
            }
            numsShifted[j] = nums[k++];
        }
        System.out.println(Arrays.toString(numsShifted));
    }
}