package replit_1;

import java.util.Scanner;

public class GradeRep {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String result= " ";

        System.out.println("please enter the grade : ");

        int grade=scan.nextInt();

        if (grade>=0&&grade<=100) {

            if (grade>=90) {
                result ="excellent";
            }
            else if (grade>=70) {
                result ="good";
            }
            else if (grade>=60) {
                result ="pass";
            } else {

                result="fail";
            }
        } else {

            result="invalid result";
        }

        System.out.println(result);



    }


}
