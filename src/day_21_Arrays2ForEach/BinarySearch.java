package day_21_Arrays2ForEach;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {


        int nums[]={-2,5,6,8,92,1,0,14,15};

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==92)
                System.out.println(i);

        }

        

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int index=Arrays.binarySearch(nums,5);

        System.out.println(index);





    }
}
