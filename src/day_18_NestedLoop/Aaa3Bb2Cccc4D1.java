package day_18_NestedLoop;

public class Aaa3Bb2Cccc4D1 {

    public static void main(String[] args) {

        String str = "aaabbccccd".toLowerCase();

        //System.out.println(str);

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    count++;
                }

                result = "" + str.charAt(i) + count;

                str = str.replace(("" + str.charAt(i)), "");

                System.out.print(result);

            }

        }

    }
}
