package replit4;

import java.util.Scanner;

public class JavaIsEqual {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava=0;
        int countPython=0;

        sentence=sentence.toLowerCase();                  //  javapythonjavajava

        for (int i=0; i<sentence.length()-2; i++) {

            if (sentence.charAt(i) == 'j' && sentence.charAt(i + 1) == 'a' && sentence.charAt(i + 2) == 'v' && sentence.charAt(i + 3) == 'a') {
                countJava++;

            }
        }
            for (int j=0; j<sentence.length()-4; j++) {

                if (sentence.charAt(j)=='p'&&sentence.charAt(j+1)=='y'&&sentence.charAt(j+2)=='t'&&sentence.charAt(j+3)=='h'
                        &&sentence.charAt(j+4)=='o'&&sentence.charAt(j+5)=='n'){
                    countPython++;

                }


            }

            boolean isEqual=countJava==countPython;


            System.out.println(isEqual);
        }
    }
