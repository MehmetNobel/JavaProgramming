package replit6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CreateArrayList {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter number except 0");

        ArrayList list = new ArrayList();

        int num;

        do {

            num = scan.nextInt();
            if (!list.contains(num) && num != 0)
                list.add(num);

        } while (num != 0);

        System.out.println("list = " + list);

        Collections.sort(list);

        System.out.println(list);

    }




}
