package day_11_Switch_Scanner;

public class Number_Converter {

    public static void main(String[] args) {

        int number=6;


        String word=(number>0&&number<7)?(number==1)?"one":(number==2)?"two":(number==3)?"three":(number==4)?"four":(number==5)?"five":"six":"ınvalid number";

        System.out.println("word = " + word);



    }
}
