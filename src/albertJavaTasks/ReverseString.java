package albertJavaTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {


        String str="MEHMET";

        String reversed="";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversed+=str.charAt(i);

        }

        System.out.println("reversed = " + reversed);



        String str2="MEHMET";

        StringBuilder builder= new StringBuilder("AHMET").reverse();

        String s = builder.toString();

        System.out.println("s = " + s);

        String str3="KADİR";

        String[] split = str3.split("");

        List<String> list1=new ArrayList<>(Arrays.asList(split));

        System.out.println("list1 = " + list1);

        List<String> list2 = list1.stream().map(p -> p + "-").collect(Collectors.toList());

        System.out.println("list2 = " + list2);


    }
}
