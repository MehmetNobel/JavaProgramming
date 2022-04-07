package day_10_Nested_If_Statements;

public class HourCalculation {

    public static void main(String[] args) {



    int seconds=4000;

    int hour=4000/3600;

    int min=(seconds - (hour*3600))/60;

    int sec=(seconds-((hour*3600)+(min*60)));

        System.out.println(" " + hour+min+sec);

    }
}
