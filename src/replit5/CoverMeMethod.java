package replit5;

import java.util.Scanner;

public class CoverMeMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    /*
    coverString("java methods", "me") ) ; ==> "java [me]thods"
     */

    public static String coverString(String main, String coverME) {
        // your code here
        String result = "";


        if (main.contains(coverME)) {

            result += main.substring(0, main.indexOf(coverME));
            result += "[" + coverME + "]";
            result += main.substring(main.lastIndexOf(coverME) + coverME.length());
        }

        return result;

    }
}
