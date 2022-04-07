package replit_1.tasks_muhtar;

import java.util.Arrays;

public class Day21Tasks {

    public static void main(String[] args) {

        /*int array[]={2,4,5,1,11,15,9,4,965434567,76543};

        System.out.println("sıralamadan önce:");

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("sıralamadan sonra:");

        System.out.println(Arrays.toString(array));

        String resultEven="";
        String resultOdd="";

        for (int i : array) {

            if(i%2==0)
                resultEven+=i+" ";
            if(i%2==1)
                resultOdd+=i+" ";

        }

        System.out.println("resultOdd = " + resultOdd);
        System.out.println("resulteven = " + resultEven);

        */

        int arr1[]={1,2,3,4,5};
        int arr2[]= {4,5,6,7,8};

        String common="";

        for (int i : arr1) {

            for (int i1 : arr2) {

                if(i==i1)
                    common+=i;

            }



        }
        System.out.println(common);



        String result="";


        String str[]={"anna", "level", "Java"};

        for (int i = 0; i < str.length; i++) {

            String palindrom="";

            for (int j =str[i].length()-1; j>=0; j--) {

                palindrom+=str[i].charAt(j);

            }

            if(str[i].equalsIgnoreCase(palindrom))
                result="palindrom";
            else
                result="not palindrom";

            System.out.println(str[i]);
            System.out.println(palindrom);
            System.out.println(result);

        }






    }
}
/*Tasks:
1. Write a program that sort the array of integer in descending
order
2. Write a program that can count the even and odd number from an
array of integers
Note: MUST use for each loop
3. Write a program that can print out the common elements from two
integer array
Ex:
arr1: {1,2,3,4,5}
arr2: {4,5,6,7,8}
output:
4 5
MUST use for each loops
4. write a program that can count how many palindromes in an array of
string
Ex:
{"anna", "level", "Java"};
output:
2
5. Write a program that can merge 3 arrays of integers
Ex:
arr1 = {30, 10, 20};
arr2 = {15, 40, 25, 35};
arr3 = {8, 9, 17, 5, 4, 1}
Output:
{30,10,20,15,40,25,35,8,9,17,5,4,1}
6. Write a program that can return the number of appearances of
âjavaâ and âpythonâ anywhere in the sentence.
(similar to the task 97 in repl.it, but
this time you MUST use arrays and for each loop)*/
