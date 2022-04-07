package replit4;

import java.util.Scanner;

public class Inhabitants {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int inhabitants = scan.nextInt();

            int k=0;

            for (int i=inhabitants; i>1; )

                inhabitants /=2; k++;

            System.out.println("Day "+ k+ "["+inhabitants+"]");


        }



    }


