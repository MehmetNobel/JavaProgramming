package day_10_Nested_If_Statements;

public class Ternaries_With_Nested_If {

    public static void main(String[] args) {


        int score=105;

        String result= (score>0&&score<=100)?(score>=90)?"excellent":(score>=80)?"great":(score>=70)?"good":"failed":"non valid score";

        System.out.println("result = " + result);







    }
}
