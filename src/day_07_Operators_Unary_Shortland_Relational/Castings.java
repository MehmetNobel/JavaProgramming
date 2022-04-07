package day_07_Operators_Unary_Shortland_Relational;

public class Castings {

    public static void main(String[] args) {

        float averageScore=20.5f;

        byte num1=(byte)averageScore;
        short num2=(short) averageScore;
        int num3=(int) averageScore;
        long num4=(long) averageScore;
         float num5=averageScore;    // there is no need for casting because the same type : float is used..
        double num6= averageScore;  // there is implicit caasting here..

        System.out.println("num6 = " + num6);
        System.out.println("num5 = " + num5);
        System.out.println("num4 = " + num4);
        System.out.println("num3 = " + num3);
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);


    }
}
