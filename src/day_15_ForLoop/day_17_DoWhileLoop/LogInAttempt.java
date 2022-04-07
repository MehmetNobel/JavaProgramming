package day_15_ForLoop.day_17_DoWhileLoop;

import java.util.Scanner;

public class LogInAttempt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName = "Ahmet";
        String password = "123";
        int attempt = 3;

        while (attempt != 0) {

            System.out.println("enter the username");
            String user = scan.nextLine();
            System.out.println("enter the password");
            String pass = scan.nextLine();

            if (user.equals(userName) && pass.equals(password)) {
                System.out.println("cograts..you have succeeded to log in");
                break;

            } else {
                System.out.println("log in attempt is unsuccessful; please try again.. " +
                        "remaining attempt right is : " + --attempt);

                if (attempt == 0) {
                    System.out.println("unfortunately your card has been blocked.speak with your bank resposible");
                    break;
                }
            }
        }
    }
}
