package replit_1.tasks_muhtar;

import java.util.Scanner;

public class BrowserChoice {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter the browser");

        String browser = scan.next();

        String result="";

        switch (browser) {

            case "chrome":

                result = "chrome is selected";

                break;

            case "edge":

                result="edge is selected";

                break;

            default:
                result="other browser is selected";

        }

        System.out.println("result = " + result);
    }
}
