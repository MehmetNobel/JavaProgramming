package day_10_Nested_If_Statements;

import java.util.Scanner;

public class Ternary_Months {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number of the month");

        int no = scan.nextInt();

        String month =(no==1)?"january":(no==2)?"february":(no==3)?"march":(no==4)?"apil":(no==5)?"may":(no==6)?"june":(no==7)?"july":
                (no==8)?"august":(no==9)?"september":(no==10)?"october":(no==11)?"november":"december";


        System.out.println("month = " + month);
    }
}
