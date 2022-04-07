package tasksfromjavasite;



public class Write3Times {

    public static String extraEnd(String str) {

        String result1="";
        String result2="";

        if (str.length()==2) {

            String str1 =str;

            return str1+str1+str1;

        }else {

            for (int i = 0; i < str.length(); i++) {

               // str =str.replace(str.charAt(0))

                result1= ""+str.charAt(str.length()-2);
                result2= ""+str.charAt(str.length()-1);

            }

            return result1+result2+result1+result2+result1+result2;
        }

    }


    public static void main(String[] args) {


        System.out.println(extraEnd("Ahmet"));






    }
}
