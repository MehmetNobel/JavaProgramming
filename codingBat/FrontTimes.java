public class FrontTimes {

    public static void main(String[] args) {

        String str="AH";

        int n=3;
        String result="";

        String result2="";


        if(str.length()>=3){

            result=""+str.charAt(0)+str.charAt(1)+str.charAt(2);

            for(int i=1; i<=n; i++){

                result2+=result;

            }
            System.out.println("result2 = " + result2);

        }else

        System.out.println("str = " + str);


    }
}
