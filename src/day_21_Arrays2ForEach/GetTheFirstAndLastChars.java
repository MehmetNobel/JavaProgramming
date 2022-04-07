package day_21_Arrays2ForEach;

public class GetTheFirstAndLastChars {

    public static void main(String[] args) {


        String str[]={"wooden spoon","zeynep safiye","esad tuna"};

        String result="";

        for (String s : str) {

           result= ""+s.charAt(0)+s.charAt(s.length()-1);
            System.out.println(result);
        }



    }
}
