package day_22_Multi_DimensionalArray;

public class ReverseTheSentence {

    public static void main(String[] args) {

        String str="I love java programmming";

        String str2[]=str.split(" ");

        String reversed="";

        for (int i = str2.length - 1; i >= 0; i--) {

            reversed+=str2[i] + " ";

        }

        System.out.println(reversed);










    }
}
