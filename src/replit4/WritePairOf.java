package replit4;

import java.util.Scanner;

public class WritePairOf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //String[] arr = new String[8];

        String arr[] = {input.next(), input.next(), input.next(), input.next(),
                input.next(), input.next(), input.next(), input.next()};

        for (int i = 0; i < arr.length - 1; i++) {

            System.out.println(arr[i] + ", " + arr[i + 1]);

            i++;
        }


    }
}
