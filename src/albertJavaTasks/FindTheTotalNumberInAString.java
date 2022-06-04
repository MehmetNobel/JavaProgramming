package albertJavaTasks;

public class FindTheTotalNumberInAString {

    public static void main(String[] args) {



        String str = "jav45ai1000sgre1at82" ;
        int sum = 0 ; // 4 + 158
        String num = ""; // 158
        for(int i= 0 ; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
                if (i == str.length()-1 || !Character.isDigit(str.charAt(i+ 1 ))){
                    sum += Integer.parseInt(num);
                    num = "";
                } } } System.out.println(sum);


        /*String str="meh12met14es6";
        String str2="65256";

        int result=0;


        //Integer i = Integer.parseInt(str);
        int i1 = Integer.parseInt(str2);

        System.out.println("i1 = " + i1);

        for (int i = 0; i <str.length() ; i++) {

            if(Character.isDigit(str.charAt(i)))
                result+=Integer.parseInt(""+str.charAt(i));

        }

        System.out.println("result = " + result);

        int arr[]={};

        for (int i = 0; i < ; i++) {

            if(Character.isDigit(str.charAt(i)))

        }


         */


    }
}
