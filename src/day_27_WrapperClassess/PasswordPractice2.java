package day_27_WrapperClassess;

public class PasswordPractice2 {

    public static void main(String[] args) {


        String str="ahmeaA.8";  // . is a special character

        boolean b1=str.length()>=8;
        boolean b2=!str.contains(" ");
        boolean b3=false;
        boolean b4=false;
        boolean b5=false;
        boolean b6=false;


        for (int i = 0; i <str.length() ; i++) {

            if(Character.isDigit(str.charAt(i)))
                b3=true;
            if(Character.isUpperCase(str.charAt(i)))
                b4=true;
            if(Character.isLowerCase(str.charAt(i)))
                b5=true;
            if(!Character.isLetterOrDigit(str.charAt(i)))
                b6=true;


        }
             boolean isStrongPassword=b1&&b2&&b3&&b4&&b5&&b6;

        System.out.println("isStrongPassword = " + isStrongPassword);







    }




}
