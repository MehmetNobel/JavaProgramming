package day_15_ForLoop.day_17_DoWhileLoop;

public class AddX {

    public static void main(String[] args) {

        String word="CYDEO";

        String result="";

        for (int i = 0; i <word.length() ; i++) {

            result +=word.charAt(i)+"x";

        }
        result= result.substring(0,result.length()-1);
        System.out.println(result);


    }
}
