package day_27_WrapperClassess;

public class StringToInteger {

    public static void main(String[] args) {

        String str="122124154";

        int result=0;

        for (int i = 0; i <str.length() ; i++) {

            if(Character.isDigit(str.charAt(i)))
                result+=Integer.parseInt(""+str.charAt(i));

        }

        System.out.println("result = " + result);

        System.out.println("str.length() = " + str.length());

    }
}
