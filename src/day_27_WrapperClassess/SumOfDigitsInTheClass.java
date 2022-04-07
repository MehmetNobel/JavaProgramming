package day_27_WrapperClassess;

import javax.xml.stream.events.Characters;

public class SumOfDigitsInTheClass {

    public static void main(String[] args) {


        String str="ab12fgfg56gfg8";

        String digits="";

        for (int i = 0; i <str.length() ; i++) {

            boolean b=Character.isDigit(str.charAt(i));

            if (b)
                digits+=""+str.charAt(i);

        }

        int num=Integer.parseInt(digits);

        int result=0;

        for (int i = 0; i < digits.length(); i++) {

            result+=Integer.parseInt(""+digits.charAt(i));

        }


        System.out.println("digitten ortaya çıkan sayı : "+num);
        System.out.println(result);

        String s="aa12258749fdgfd";

        int sum=0;

        for (int i = 0; i <s.length() ; i++) {

            if(Character.isDigit(s.charAt(i))){   // charcter digit mi değil mi önce onu kontrol ediyoruz.

                sum+=Integer.parseInt(""+s.charAt(i));   // digit ise topluyoruz daha sonra.

            }


        }
        System.out.println(sum);









    }
}
