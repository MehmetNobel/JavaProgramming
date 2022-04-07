package day_11_Switch_Scanner;

public class Switch_With_Or {

    public static void main(String[] args) {

        char ch='C';

        String result=" ";


        switch (ch) {
// OR STRUCTURE IN SWITCH:
            case 'A':

            case 'B':

            case 'C':

            case 'D':

                result="passed";

            break;

            case 'E':
                result="failed";
                break;

            default:
                result="invalid item";


        }

        System.out.println(result);


    }
}
