package day_39_Recap.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {

    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));

        for (Integer integer : list) {

            System.out.print(integer+ " ");

        }

        System.out.println("*****************************");

        list.removeIf(p->!(p%4==0));

        System.out.println(list);

        Integer a=100;

        list.remove(a);

        ArrayList<Integer> list2=new ArrayList<>(list);

        System.out.println(list);

        System.out.println(list.equals(list2));

        System.out.println(list2.get(list2.size() - 1));


        for (int i = 0; i < list2.size(); i++) {

            System.out.println(list2.get(i));

        }

        for(int i=list2.size()-1; i>=0; i--){

            System.out.print(list2.get(i)+" ");
        }

        System.out.println(list2.removeIf(p -> p < 0));

        System.out.println(list2);

        byte a1=10;

        Byte a2=a1; // autoboxing

        Integer i1=20;

        int i2=i1;  // unboxing

        System.out.println(i1 == i2);

        String str="12345";

        int strNum=Integer.parseInt(str);

        System.out.println(strNum+1);

        int sum=0;

        for (int i = 0; i <str.length() ; i++) {

            sum+=Integer.valueOf(""+str.charAt(i));

        }
        System.out.println("sum = " + sum);

        System.out.println("str.length() = " + str.length());


    }


}
