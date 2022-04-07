package day_16_ForLoopsAndStringExercise;

public class RemoveDuplicates {

    public static void main(String[] args) {


        String str = "eeeesssssaaaadddddd1234444";

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            char ch = str.charAt(i );

            String chSt = "" + ch;

            boolean isContain = str.substring(i + 1).contains(chSt);

            if (isContain) {

                result +="";
            }else {

                result +=chSt;
            }

            }

        System.out.println("str = " + str);

        System.out.println("result = " + result);;

        }
    }
