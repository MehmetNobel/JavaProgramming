package replit4;

import java.util.Scanner;

public class Triples {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        //WRITE YOUR CODE HERE


        for (int i = 0; i < str.length()-2; i++) {

            String s1 = "" + str.charAt(i);
            String s2 = "" + str.charAt(i + 1);
            String s3 = "" + str.charAt(i + 2);


            if (s1.equalsIgnoreCase(s2) && s2.equalsIgnoreCase(s3)) {

                count++;


            }

        }

        System.out.println(count);

    }
}

