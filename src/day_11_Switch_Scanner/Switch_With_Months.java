package day_11_Switch_Scanner;

public class Switch_With_Months {

    public static void main(String[] args) {

        int year = 2000;

        int month = 2;

        String result = " ";

        if (month >= 1 && month <= 12) {

            switch (month) {

                case 2:

                 result=(year%4==0)?"29 days":"28 days";

                    break;

                case 4:
                case 6:
                case 9:
                case 11:   // swith te or kullanımı

                    result = "30 days";

                    break;

                default:   // swith te or kullanımı ( kalan diğer ayları belirtmek için)

                    result = "31 days";

                    break;


            }


        } else {

            System.out.println("invalid number");
        }

        System.out.println(result);


    }


}
