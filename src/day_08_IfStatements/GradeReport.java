package day_08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {


        int grade = 58;

        if (grade >= 90) {

            System.out.println("excellent");
        }

        if (grade >= 80 && grade <= 89) {

            System.out.println("great");
        }
        if (grade >= 70 && grade <= 79) {

            System.out.println("good");
        }
        if (grade >= 60 && grade <= 69) {
            System.out.println("passed");
        }
        if (grade <= 59) {

            System.out.println("failed");
        }
    }
}
