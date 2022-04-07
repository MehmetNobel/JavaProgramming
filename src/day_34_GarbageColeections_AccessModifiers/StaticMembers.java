package day_34_GarbageColeections_AccessModifiers;

import static day_33_Statics_Cons_Go_on.Student.schoolName;

import static utilities.MathUtility.substraction;
import static utilities.StringUtility.isPalindrom;

import static utilities.MathUtility.max;

public class StaticMembers {


    public static void main(String[] args) {

        System.out.println(schoolName);  // there is no need to say Student.schoolName. it is ok just like this.

        System.out.println(schoolName);

        System.out.println(max(3,5));

        System.out.println(isPalindrom("AHMET"));

        System.out.println("substraction(15,4) = " + substraction(15, 4));


    }


}
