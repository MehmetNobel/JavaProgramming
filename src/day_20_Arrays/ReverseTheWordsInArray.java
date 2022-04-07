package day_20_Arrays;

public class ReverseTheWordsInArray {

    public static void main(String[] args) {

        String classmates[]={"mehmet", "ali", "mehmet","eray", "latif", "coşkun","omer"};

        String result="";

        for (int i = 0; i < classmates.length; i++) {

            String word1=classmates[i];

            String wordR="";

            for (int j = word1.length()-1; j >=0 ; j--) {

                wordR+=word1.charAt(j);
            }
            result+=wordR+" ";
        }
        System.out.println(result);
    }
}
