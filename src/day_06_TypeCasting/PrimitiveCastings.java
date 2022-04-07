package day_06_TypeCasting;

public class PrimitiveCastings {

    public static void main(String[] args) {


        double a=123.52;

        float f1=1225f;

        short f2= (short) f1;  // explict casting

        int b= (int) a;

        System.out.println(a + " : " + b);

        float c= (float) a;  // ; dan sonra alt + enter yaparak otmatik casting secenegine ulaşabiliriz.

        System.out.println(c);

        System.out.println((double)100/3);

        System.out.println(f2);

    }
}
