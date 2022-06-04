package albertJavaTasks;

public class Palindrom {

    public static boolean isPalindrom(String str){

        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {

            result+=str.charAt(i);

        }

        if(str.equals(result))
            return true;
        else
            return false;

    }




    public static void main(String[] args) {

        System.out.println("isPalindrom(\"kayak\") = " + isPalindrom("kayak"));


        String str="kayak";

        String builder=new StringBuilder(str).reverse().toString();

        if(str.equals(builder)) {
            System.out.println("yes palindrom");
        }
        else {
            System.out.println("not palindrom");
        }


        String builder2=new StringBuilder(str).append(str.repeat(2)).toString();

        System.out.println("builder2 = " + builder2);


    }
}
