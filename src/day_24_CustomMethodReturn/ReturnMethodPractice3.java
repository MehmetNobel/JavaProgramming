package day_24_CustomMethodReturn;

public class ReturnMethodPractice3 {



    public static String removeDuplicate2( String str) {

        String result="";

        for (int i = 0; i <str.length() ; i++) {

            if (!result.contains(""+str.charAt(i))){

                result+=str.charAt(i);
            }

        }

        return result;


    }


    public static String removeDuplicates(String str) {

        String result = "";  // aaabbbcccd

        for (int i = 0; i < str.length(); i++) {

            int count=0;

            for (int j = 0; j <str.length() ; j++) {

                if(str.charAt(i)==str.charAt(j)){

                    count++;}

            }

            if (count==1)

                result+=str.charAt(i);

        }
        return result;

    }


    public static void main(String[] args) {

       String result=removeDuplicates("ahmetarslan");

        System.out.println(result);

        System.out.println(removeDuplicate2("aaabbbcdde"));

        String str3="contain ahmet mehmet";


        boolean b1= str3.contains("t m");

        System.out.println(b1);




    }
}
