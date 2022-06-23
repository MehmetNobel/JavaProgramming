package albertJavaTasks;

import java.util.Arrays;

public class FatihArrayQuestion {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5, 7};
        int arr2[] = {1, 2, 3, 4, 6, 7};

        System.out.println("Arrays.equals(arr1,arr2) = " + Arrays.equals(arr1, arr2));

        Arrays.sort(arr1);

        Arrays.sort(arr2);

        int i=0;

        for (i = 0; i < arr1.length; i++) {

                if (arr1[i] == arr2[i]) {
                    System.out.println("true");

                } else {
                    System.out.println("difference is " + arr1[i]);
                }


        }
    }
}






//System.out.println(Arrays.toString(arr1));
// System.out.println(Arrays.toString(arr2));



        /*String str1="";
        String str2="";

        for (int i : arr1) {

            str1+=i;

        }
        for (int i : arr2) {

            str2+=i;

        }


        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        for (int i = 0; i <str1.length()-1 ; i++) {

            for (int j = 0; j <str2.length()-1 ; j++) {

                if(str1.contains(""+str2.charAt(j))){

                    System.out.println("true");
                }else{
                    System.out.println("do not contain: " + str2.charAt(j));
                }


            }



        }






         */















