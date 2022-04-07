package replit_1.tasks_muhtar;

import java.util.Scanner;

public class HowManyPositivenNegative {

    public static void main (String[] args) {

        Scanner scan=new Scanner(System.in);

        String neg="";
        String pos="";
        int k=0;
        int l=0;

        for (int i = 1; i <=10 ; i++) {

            System.out.println("enter the numbers");

            int num=scan.nextInt();

            if (num<0) {
                neg +=num+" ";
                k++;
            }else if (num>0) {
                pos +=num+" ";
                l++;
            }

        }
        System.out.println("pos = " + pos+"pos sayısı: "+k);
        System.out.println("neg = " + neg+ "nega. sayısı : "+ l);









    }




}
