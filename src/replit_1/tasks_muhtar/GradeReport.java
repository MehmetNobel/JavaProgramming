package replit_1.tasks_muhtar;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter the score");

        int score=scan.nextInt();

        String result ="";

        if (score>=0&&score<=100) {

            result=(score>=85)?"A":(score>=70)?"B":(score>=55)?"C":(score>=45)?"D":"E";

        }else {
            System.out.println("ınvalid score");
        }


        System.out.println("result = " + result);




    }
}
