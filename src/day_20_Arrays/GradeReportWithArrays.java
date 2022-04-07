package day_20_Arrays;

import java.util.Arrays;

public class GradeReportWithArrays {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[3];

        String result[] =new String[3];

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= 90) {

                grades[i] = 'A';
            } else if (scores[i] >= 80) {

                grades[i] = 'B';
            } else if (scores[i] >= 70) {

                grades[i] = 'C';
            }

            result[i] =""+grades[i];

        }

        System.out.println(Arrays.toString(result));

        String report="";


        for (int i = 0; i < grades.length ; i++) {

            report +=names[i]+"'s score is "+scores[i]+" and grade is "+ result[i]+";";

        }

        System.out.println(report.substring(0,report.lastIndexOf(";")));

    }


}

/*
4. given the following arrays:
      String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
1. write a program that can store the grades of the students in
the array named grades
2. print the grade report of each students in separate lines
Ex:
Anna's score is 90, and grade is A
 */