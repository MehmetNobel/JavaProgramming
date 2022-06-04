package albertJavaTasks;

public class HowManyTimesEachCharecter {

    public static void main(String[] args) {

        String str="aaabbccccddddd";

        String result="";

        for (int i = 0; i <str.length() ; i++) {

            if(!result.contains(""+str.charAt(i)))
                result+=str.charAt(i);

        }
        System.out.println("result = " + result);

        String result2="";

        for (int i = 0; i <result.length() ; i++) {

            int count=0;

            for (int j = 0; j <str.length() ; j++) {

                if(result.charAt(i)==str.charAt(j))
                    count++;
            }
            System.out.println(result.charAt(i)+" times : "+ count);
            result2+=""+result.charAt(i)+count;

        }

        System.out.println("result2 = " + result2);


    }
}
