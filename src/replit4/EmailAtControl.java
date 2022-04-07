package replit4;

import java.util.Scanner;

public class EmailAtControl {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String report = "";

        String email2[] = email.split("@");

    /*String email2[]=email.split("");

     for(int i=0; i<email2.length;i++) {*/

        if (email.indexOf("@") != email.lastIndexOf("@")) {

            System.out.println("invalid email");
        } else {

            report = "Email id: " + email2[0] + "\n" +
                    "Email domain: " + email2[1];


        }

        System.out.println(report);
    }
}

/*email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com

 */


    //Write your code below

