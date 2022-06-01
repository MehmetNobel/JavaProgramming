package day_53_Functional_Interface_Lambda;

public class Test3 {

    public static void main(String[] args) {

        MyThirdFunctionalInterface<Integer> mtfi=n-> { return n*n*n;};

        System.out.println("mtfi.test(2) = " + mtfi.test(2));

        MyThirdFunctionalInterface<String> mtfi2=n->{

            String result="";

            for (int i = n.length()-1; i >=0 ; i--) {

                result+=n.charAt(i);
            }

            return result;
        };

        System.out.println("mtfi2.test(\"ahmet\") = " + mtfi2.test("ahmet"));


        MyThirdFunctionalInterface<String> thirdTest=n->{

            //short way of reversing a string.
            String reverse=new StringBuilder(n).reverse().toString();

            return reverse;

        };

        System.out.println("thirdTest.test(\"wooden spoon\") = " + thirdTest.test("wooden spoon"));

    }
}
