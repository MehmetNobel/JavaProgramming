package exersize_1;

public class DoubleX {

    public static boolean doubleX(String str) {

        for (int i = 0; i <str.length()-1; i++) {

            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x'&&str.charAt(str.indexOf("x")+1)=='x')
                return true;

        }

        return false;

    }
    public static void main(String[] args) {


        System.out.println("doubleX(\"aaxxbb\") = " + doubleX("xaxxx"));


    }





    }
