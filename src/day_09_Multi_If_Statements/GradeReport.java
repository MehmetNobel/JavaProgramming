package day_09_Multi_If_Statements;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" notu giriniz: ");

        int not = scan.nextInt();

        char grade;

        if (not>=0&&not<=100) {

            if (not >= 85 && not <= 100) {

                grade = 'A';
            } else if (not >= 70 && not <= 84) {

                grade = 'B';
            } else if (not >= 55 && not <= 69) {

                grade = 'C';
            } else if (not >= 45 && not <= 59) {

                grade = 'D';
            } else {

                grade = 'E';
            }

            System.out.println("harfi notu : " +grade );

        }else {

            System.out.println("yanlış veri girişi.Lütfen dogru giriniz..");
        }


        }
    }
