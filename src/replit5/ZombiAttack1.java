package replit5;

import java.util.Arrays;
import java.util.Scanner;

public class ZombiAttack1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int control[]={0,0,0,0};

        //TODO. Write you code below this line.

        int day = 0;

        while(true){
            for(int i=0; i<inhabitants.length; i++){
                inhabitants[i]=inhabitants[i]/2;
            }
            System.out.println("Day "+day+++" "+Arrays.toString(inhabitants));

            if(Arrays.equals(inhabitants,control)){
                System.out.println("---- EXTINCT ----");
                break;}


               }


    }

    }

