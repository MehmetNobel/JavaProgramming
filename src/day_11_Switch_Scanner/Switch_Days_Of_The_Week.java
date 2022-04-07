package day_11_Switch_Scanner;

public class Switch_Days_Of_The_Week {

    public static void main(String[] args) {

        int num=10;

        switch (num) {

            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid item");
                break;  // break konmayabilir ; altta süslü parantez olduğu için.

        }

    }



}
