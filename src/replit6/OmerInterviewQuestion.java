package replit6;

import java.util.Arrays;

public class OmerInterviewQuestion {

    public static void main(String[] args) {


        String str="123456789999887745125";

        int part=5;

        String strArr[]=str.split("");

        System.out.println("strArr = " + Arrays.toString(strArr));

        int max=Integer.MIN_VALUE;

        for (int i = 0; i < strArr.length-2; ) {

            int partValue=1;

            for (int j = 1; j <=part ; j++) {

                partValue *=Integer.parseInt(strArr[i++]);

            }

            if(partValue>max)
                max=partValue;

        }
        System.out.println("max = " + max);


    }

}
