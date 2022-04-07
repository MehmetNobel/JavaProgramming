package day_18_NestedLoop;

public class Exerciseaaabbccd {
    public static void main(String[] args) {

        String ahmet = "aaabbcccd";

        String result = "";

        for (int i = 0; i < ahmet.length(); i++) {

            int count = 0;

            for (int j = 0; j < ahmet.length(); j++) {

                if (ahmet.charAt(i) == ahmet.charAt(j)) {

                    count++;
                }
            }
            result =""+ahmet.charAt(i) + count;

            ahmet = ahmet.replace("" + ahmet.charAt(i), "");

            System.out.print(result);

        }



    }


}




