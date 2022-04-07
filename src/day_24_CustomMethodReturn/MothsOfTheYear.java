package day_24_CustomMethodReturn;

public class MothsOfTheYear {


    public static void monthsOfTheYear(int number) {

        String name = "";
        if (number >= 0 && number <= 12) {

            name = (number == 1) ? "jan" : (number == 2) ? "feb" : (number == 3) ? "march" : (number == 4) ? "april" : (number == 5) ? "may"
                    : (number == 6) ? "june" : (number == 7) ? "july" : (number == 8) ? "august" : (number == 9) ? "september"
                    : (number == 10) ? "oct" : (number == 11) ? "nov" : "dec";

        } else {

            name = "invalid number";

        }

        System.out.println(name);

    }

    public static void nameOfTheDay(int number) {

        String name = "";
        if (number >= 0 && number <= 7) {

            name = (number == 1) ? "mon" : (number == 2) ? "tuesday" : (number == 3) ? "wednesday" : (number == 4) ? "thursday" : (number == 5) ? "friday"
                    : (number == 6) ? "saturday" : "sunday";

        } else {

            name = "invalid number";

        }

        System.out.println(name);

    }

    public static void main(String[] args) {

        monthsOfTheYear(12);

        monthsOfTheYear(15);

        nameOfTheDay(7);

        nameOfTheDay(15);


    }
}
