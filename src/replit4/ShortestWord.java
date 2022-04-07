package replit4;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String strArray[] = str.split(",");

        String shortt = "";

        int min = 100;

        String indis = "";

        for (int i = 0; i < strArray.length; i++) {

            if (strArray[i].length() <= min) {

                min = strArray[i].length();

               // shortt = strArray[i];

            }

        }
        for (String s : strArray) {

            if(s.length()==min) {

                shortt+=s+" ";


        }

            }


        shortt = shortt.trim();
        String newStr[] = shortt.split(" ");
        Arrays.sort(newStr);


        System.out.println(Arrays.toString(newStr));

        System.out.println(indis);
        //System.out.println(newStr);


    }
}