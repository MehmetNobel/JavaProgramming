package day_24_CustomMethodReturn;

public class ReturnMethodPractice2 {


    public static String gradeReport(int score) {

        String result = "";

        if (score < 0 || score > 100) {

            result = "invalid score";
        } else {
            result = (score >= 85) ? "excellent" : (score >= 70) ? "good" : (score >= 55) ? "medium" : (score >= 45) ? "bad" : "failed";

        }
        return  result;
    }


    public static void main(String[] args) {

        System.out.println(gradeReport(250));

        System.out.println(gradeReport(90));

        System.out.println(gradeReport(32));


    }
}
