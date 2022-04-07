package replit4;

public class TaskOscar {

    public static void main(String[] args) {


        String strThree = "abcd1234!@#$efghi6789#$%^ABCD";

        int sumOfdigits = 0;
        String digits = "";
        String uppercases = "";
        String lowercases = "";
        String specialChars = "";
        String lettersOrDigit = "";
        String letters = "";

        for (Character each : strThree.toCharArray()) {

            if (Character.isLetterOrDigit(each)) {
                lettersOrDigit += ""+each;

                if (Character.isLetter(each))
                    letters += ""+each;
                if (Character.isUpperCase(each))
                    uppercases += ""+each;
                if (Character.isLowerCase(each))
                    lowercases += ""+each;

            }

            if(Character.isDigit(each)) {
                digits+=""+each;
                sumOfdigits += Integer.parseInt("" + each);
            }
            else{

                specialChars+=each;
            }

        }

        System.out.println("lettersOrDigit = " + lettersOrDigit);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("uppercases = " + uppercases);
        System.out.println("lowercases = " + lowercases);
        System.out.println("specialChars = " + specialChars);
        System.out.println("sumOfdigits = " + sumOfdigits);


    }
}
