package day_19_LoopPractices;

public class FindUniqueChars {

    public static void main(String[] args) {

        String str = "aaabccdde";

        String result = "";

        String result2="";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }


        for (int i = 0; i < result.length(); i++) {

            int count=0;

            for (int j = 0; j < str.length(); j++) {

                if (result.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            if (count>1){

                result2 +=result.charAt(i);
            }

            }

        System.out.println("result2 = " + result2);


        }


    }

