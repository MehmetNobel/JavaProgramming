package day_16_ForLoopsAndStringExercise;

public class ObtainSpecialChars {

    public static void main(String[] args) {


        String str = "AADKFDKKjhdfFBBGjh  dsjf12121BDG  B98985454<q656563+^ <5½";

        String resultCL = "";

        String resultsL = "";

        String resultdL = "";

        String resultsp="";

        for (int i = 0; i < str.length() - 1; i++) {

            char ch = str.charAt(i);

            String chSt=""+ch;

            boolean cLetter = ch >= 'A' && ch <= 'Z';

            boolean sLetter = ch >= 'a' && ch <= 'z';

            boolean digits = ch >= '1' && ch <= '9';

            boolean space = chSt.equals(" ");

            if (cLetter) {

                resultCL += ch;

            } else if (sLetter) {

                resultsL += ch;

            } else if (digits) {

                resultdL += ch;

            } else {

                if (space) {

                    resultsp += "";
                } else {

                    resultsp += ch;
                }
            }

        }
        System.out.println("resultsp = " + resultsp);
        System.out.println("resultdL = " + resultdL);
        System.out.println("resultsL = " + resultsL);
        System.out.println("resultCL = " + resultCL);

    }
}
