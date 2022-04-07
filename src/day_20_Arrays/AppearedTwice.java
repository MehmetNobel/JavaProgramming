package day_20_Arrays;

import java.util.Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        char chArray[]={'A', 'C', 'D', 'E', 'E', 'F', 'G'};

        String result="";

        for (int i = 0; i < chArray.length; i++) {

            int count=0;

            for (int k = 0; k < chArray.length; k++) {

                if(chArray[i]==chArray[k]) {
                    count++;
                }

            }

            if (count==2) {

                result+=chArray[i];
            }

        }

        System.out.println(Arrays.toString(chArray));

        System.out.println(result);







    }
}
