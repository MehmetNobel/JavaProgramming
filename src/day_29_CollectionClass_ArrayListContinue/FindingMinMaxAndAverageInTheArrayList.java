package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class FindingMinMaxAndAverageInTheArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(10,20,33,43,50));

        int max=list.get(0); int min=list.get(0); int sum=0;
        double average=0;

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i)>max)
                max=list.get(i);

            if(list.get(i)<min)
                min=list.get(i);

            sum+=list.get(i);


        }
        System.out.println("average=sum/list.size() = " + (average =(double) sum / list.size()));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);

        System.out.println("*****************************");

       String s="12564";
        String s5="125ahmet64";

        String result="";

        for (int i = 0; i <s5.length() ; i++) {

            if(Character.isDigit(s5.charAt(i)))
                result+=s5.charAt(i);

        }
        System.out.println(result);

        int iresult=Integer.parseInt(result);

        System.out.println("iresult = " + (iresult+1));


        System.out.println("***************************");


       int i=Integer.parseInt(s);

       int s2=Integer.valueOf(s);

        System.out.println("s2 = " + (s2+5));

        System.out.println("i = " + (i+5));


    }
}
