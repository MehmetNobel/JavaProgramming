package day_21_Arrays2ForEach;

public class MaxNumberWithForEach {
    public static void main(String[] args) {


        int nums[]={1,2,3,4,5};

       int max=nums[0];

        for (int each:nums) {

            if(each>max)
                max=each;

        }

        System.out.println(max);


    }
}
