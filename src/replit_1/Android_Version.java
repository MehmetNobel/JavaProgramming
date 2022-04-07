package replit_1;

import java.util.Scanner;

public class Android_Version {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double version = input.nextDouble();

        String result=(version==1.5)?"Cupcake":(version==1.6)?"Donut":(version==2.1)?"Eclair":(version==2.2)?"Fraya"
                :(version==2.3)?"Gingerbread":(version==3.1)?"Honeycomb":(version==4.0)?"Ice Cream Sandwich":(version==4.1)?
                "Jelly Bean":(version==4.4)?"Kitkat":(version==5.0)?"Lollipop":(version==8.0)?"Oreo":(version==9.0)?"Pie":"Sorry, I don't know this version!";

        System.out.println(result);

    }
}
/*
1.5 - Cupcake 1.6 - Donut 2.1 - Eclair 2.2 - Froyo 2.3 - Gingerbread 3.1 - Honeycomb 4.0 - Ice Cream Sandwich
4.1 - Jelly Bean 4.4 - KitKat 5.0 - Lollipop 8.0 - Oreo 9.0 - Pie
 */