package exersize_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PromptUserToAddElementToArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 1; i <=3 ; i++) {

            System.out.println("sayı giriniz: ");

            int num= scan.nextInt();

            list.add(num);

        }
        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());

        list.removeIf(p->p>5);  // lamda operation. in itself executes  a loop.

        System.out.println("list = " + list);

        list.addAll(Arrays.asList(12,14,1,2,3));

        System.out.println("list = " + list);


    }
}
