package replit_1;

import java.util.Scanner;

public class Shopping_List {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("item1 and its price: ");

        String item1 = scan.next();

        double p1 = scan.nextDouble();

        System.out.println("item2 and its price: ");

        String item2 = scan.next();

        double p2 = scan.nextDouble();

        System.out.println("item3 and its price: ");

        String item3 = scan.next();

        double p3 = scan.nextDouble();

        double totalprice = p1 + p2 + p3;

        String report="Item1: "+item1+": "+p1+", "+"Item2: "+item2+": "+p2+", "+
                "\n"+"Item3: "+item3+": "+p3+"\n"+"Total price: "+totalprice;

        System.out.println(report);






    }
}
