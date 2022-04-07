package day_23_CustomMethods_Intro;

import java.util.Arrays;

public class TasksOfDay23 {


    public static void eligible(int age, String str){

        boolean b=age>=20&&str.equalsIgnoreCase("USA");

        if(b)
            System.out.println("eligible to vote");

        else
            System.out.println("not eligible");


    }

    public static void areaOfCircle(int r){

        double area=Math.PI*r*r;

        System.out.println(area);


    }

    public static void posNegOrZero(int num){

        if (num>0)
            System.out.println("positive");
        else if (num<0)
            System.out.println("negative");
        else
            System.out.println("zero");

    }

    public static void printEachCharOfString(String str){

        String strArray[]=str.split("");

        System.out.println(Arrays.toString(strArray));

    }

    public static void calculator(int num1, int num2, char operation){

        int result=0;

        switch (operation) {

            case '+':

                result=num1+num2; break;
            case '-':

                result=num1-num2; break;
            case '*':

                result=num1*num2; break;
            case '/':

                result=num1/num2; break;

        }

        System.out.println("result is "+ result);


    }

    public static void writeInFormat(String str){

        str=str.toLowerCase();

        str=(""+str.charAt(0)).toUpperCase()+str.substring(1,str.indexOf(" "))+" "+
                (""+str.charAt(str.indexOf(" ")+1)).toUpperCase()+str.substring(str.indexOf(" ")+2);

        System.out.println("Result is "+ str);
    }

    public static void anagramOrNot(String str1, String str2) {

        String str1Arr[]=str1.split("");

        String str2Arr[]=str2.split("");

        Arrays.sort(str1Arr);

        Arrays.sort(str2Arr);

        boolean b=Arrays.equals(str1Arr,str2Arr);

        if (b)

            System.out.println("anagram");

        else

            System.out.println("not anagram");

    }

    public static void printElementOfArray(int[] arr){

        for (int i : arr) {

            System.out.print(i+" ");

        }


    }

    public static void main(String[] args) {

        eligible(25,   "USA");

        eligible(15,   "USA");

        eligible(25,   "tr");

        areaOfCircle(1);

        posNegOrZero(0);

        printEachCharOfString("mehmet");

        calculator(20,4,'/');

        writeInFormat("cYDEO ScHOOL");

        anagramOrNot("silent", "listen");


        int arr1[]=new int[]{1,2,3,4};

        printElementOfArray(arr1);

    }
}
