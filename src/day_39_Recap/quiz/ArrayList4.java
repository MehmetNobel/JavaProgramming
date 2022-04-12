package day_39_Recap.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList4 {

    public static void main(String[] args) {


        ArrayList<Character> list=new ArrayList<>();

        for (char i = 'a'; i <='z'; i++) {

            list.add(i);

        }
        System.out.println("list = " + list);

        list.clear();

        for (char i = 'A'; i <='Z' ; i++) {

            list.add(i);


        }
        System.out.println("list = " + list);


        boolean result=list.containsAll(Arrays.asList('a','c','D'));

        System.out.println("result = " + result);







            /*list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for (Integer each : list) {

            if(each%2!=0){
                continue;
            }

            System.out.println(each+" ");
            break;
            
        }

             */





    }
}
