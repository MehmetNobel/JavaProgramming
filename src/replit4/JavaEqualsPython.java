package replit4;

import java.util.Scanner;

public class JavaEqualsPython {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava=0;
        int countPython=0;

        sentence=sentence.toLowerCase();                  //  javapythonjavajava

        for (int i=0; i<sentence.length(); i++) {

            if (sentence.substring(i).startsWith("java")) {
                countJava++;

            }
        }
        for (int j=0; j<sentence.length(); j++) {

            if (sentence.substring(j).startsWith("python")){
                countPython++;

            }


        }

        boolean isEqual=countJava==countPython;


        System.out.println(isEqual);
    }
}
