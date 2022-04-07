package day_08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int num=101;

        boolean isEven=num%2==0;
        boolean isOdd=!isEven;

        if(isEven) {

            System.out.println(num + " isEven = " + isEven);
        }
        if(isOdd) {

            System.out.println(num + " isOdd = " + isOdd);
        }
    }
}
