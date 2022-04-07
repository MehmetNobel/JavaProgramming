package day_27_WrapperClassess;

public class WrapperClassIntro {

    public static void main(String[] args) {


        String str="123";

        int num1=Integer.parseInt(str);

        System.out.println(num1+1);

        String str2="10.5";

        double db=Double.parseDouble(str2);

        System.out.println(db);

        int max=Integer.MAX_VALUE;

        int min=Integer.MIN_VALUE;

        System.out.println(max);

        System.out.println(min);

        long l1=Long.MAX_VALUE;

        long l2=Long.MIN_VALUE;

        System.out.println(l1);

        System.out.println(l2);



        String str3="1245";

        int n1=Integer.parseInt(str3);

        System.out.println(n1+1000);

        int nummax=Integer.MAX_VALUE;

        System.out.println(nummax);

        int nummin=Integer.MIN_VALUE;

        System.out.println(nummin);

        String str5="10.5";

        double d1=Double.parseDouble(str5);

        System.out.println(d1+10);

        String str10="37";

        byte b1=Byte.parseByte(str10);

        System.out.println(b1);






    }
}
