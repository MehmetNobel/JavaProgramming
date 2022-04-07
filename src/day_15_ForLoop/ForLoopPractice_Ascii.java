package day_15_ForLoop;

public class ForLoopPractice_Ascii {

    public static void main(String[] args) {

        /*for (char ch='A'; ch<='Z'; ch++){

            System.out.print("ch = " + ch+" ");

        }

        System.out.println();

        for (char ch='a'; ch<='z'; ch++){

            System.out.print("ch = " + ch+" ");

        }

        System.out.println();

        for (char ch='Z'; ch>='A'; ch--){

            System.out.print("ch = " + ch+" ");

        }

        System.out.println();
        for (char ch='z'; ch>='a'; ch--){

            System.out.print("ch = " + ch+" ");

        }*/

        String str="ı coded [jav212121a] today";

        str=str.substring(str.indexOf("[")+1, str.lastIndexOf("]"));


        System.out.println(str);

        /*   Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */
    }
}
