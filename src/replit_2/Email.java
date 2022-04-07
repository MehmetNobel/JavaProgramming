package replit_2;

import java.util.Scanner;

public class Email {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "please enter the email");

        String email = scan.nextLine();

        String name=email.substring(0,email.indexOf("_"));

        String surname=email.substring(email.indexOf("_")+1,email.indexOf("@"));

        String domain=email.substring(email.indexOf("@g")+1, email.lastIndexOf("."));

        String nfchar=(name.charAt(0)+"").toUpperCase();

        String sfchar=(surname.charAt(0)+"").toUpperCase();

        String name2part= email.substring(1,email.indexOf("_"));

        String newname=""+nfchar+name2part;

        String surname2part=email.substring(email.indexOf("_")+2,email.indexOf("@"));

        String newsurname=""+sfchar+surname2part;


        System.out.println("First name: "+newname);
        System.out.println("Last name: "+newsurname);
        System.out.println("Domain: "+domain);








    }
}