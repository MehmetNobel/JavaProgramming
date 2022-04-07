package day_10_Nested_If_Statements;

public class Ternaries_Info {

    public static void main(String[] args) {


        int x=21;

        String oddOrEven=(x%2==0)?"Even":"Odd";

        System.out.println("oddOrEven = " + oddOrEven);

        int age=25;

        String eligbleOrNot=(age>18)?"eligible":"not eligible";

        System.out.println("eligbleOrNot = " + eligbleOrNot);

        int num=-5;

        String posOrNot=(num>0)?"positive":(num==0)?"zero":"negative";

        System.out.println("posOrNot = " + posOrNot);


        int c=20;

        boolean result2=(false||true||++c>20);  // eger || logical or yaparsak ve baştaki part true olursa geri kalana bakmıyor
        // ama sadece | tek çizgi bitwise olursa her halukarda sağ tarafa geciyor ve  c yi artırıyor.


        boolean result3=(false&&true||++c>20);   // sol taraf false oldugundan kontrol için sag tarafa gecti ve sayıyı artırdı.

        System.out.println("result3 = " + result3);

        System.out.println("c = " + c);

        c=20;
        boolean result4=(true&&true||++c>20);



        System.out.println("result4 = " + result4);

        System.out.println("c = " + c);

    }



}


