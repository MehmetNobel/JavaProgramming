package day_27_WrapperClassess;

import javax.xml.stream.events.Characters;

public class PasswordPractice {


    public static boolean containsUppercase(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (Character.isUpperCase(s.charAt(i)))
                return true;

        }

        return false;

    }

    public static boolean containsLowercase(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLowerCase(s.charAt(i)))
                return true;

        }

        return false;

    }

    public static boolean containsDigits(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i)))
                return true;

        }

        return false;

    }

    public static boolean containsSpecialChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (!Character.isLetterOrDigit(s.charAt(i)))
                return true;

        }

        return false;

    }

    public static boolean containsSpace(String s) {

        for (int i = 0; i < s.length(); i++) {

            if ((""+s.charAt(i)).equals(" "))
                return true;

        }

        return false;

    }


    public static void main(String[] args) {


        String str = "ahmetA125.";

        boolean b1 = str.length() >= 8;

        if(containsDigits(str)&&!containsSpace(str)&&containsUppercase(str)&&containsLowercase(str)&&containsSpecialChar(str)&&b1){

            System.out.println("password is valid");

        }else {

            System.out.println("password is not valid");
        }






    }
}
