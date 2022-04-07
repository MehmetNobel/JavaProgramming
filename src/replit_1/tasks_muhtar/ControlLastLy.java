package replit_1.tasks_muhtar;

import java.util.Scanner;

public class ControlLastLy {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        System.out.println("enter word");

        String word= scan.next();

       // int last=word.indexOf(word.length()-1);

       // int beforeLast=word.indexOf(word.length()-2);

        char ch1=word.charAt(word.length()-1);

        char ch2=word.charAt(word.length()-2);

        String control=""+ch2+ch1;

        if (control.equalsIgnoreCase("ly")) {

            System.out.println("really???");

        }else {

            System.out.println("never mind");
        }




    }
}
