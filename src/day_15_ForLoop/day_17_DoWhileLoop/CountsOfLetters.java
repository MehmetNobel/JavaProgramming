package day_15_ForLoop.day_17_DoWhileLoop;

public class CountsOfLetters {

    public static void main(String[] args) {
        //aaabbccccd
        //aaa3bb2cccc4d

        String str="aaa3bb2cccc4d";

        String newstr="";

        int k=0;

        for (int i = 0; i <str.length()-1 ; i++) {

            while (str.charAt(i)==str.charAt(i+1)) {

                if (k>0) {
                    newstr += str.charAt(i) + str.charAt(i + 1) + k;
                }
                str =str.substring(i+1);

                k++;


            }


        }

        System.out.println(str);
        System.out.println(newstr);

    }
}
