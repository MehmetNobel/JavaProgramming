package tasksfromjavasite;

public class LibraryFrequencyOfChars {

    public static void main(String[] args) {


        String str="aaabbcccccdddd";

        String result="";

        String word="";


        for (int i = 0; i <str.length() ; i++) {

            if (!word.contains(""+str.charAt(i))) {

                word +=str.charAt(i);
            }

        }


        for (int i = 0; i <word.length() ; i++) {

            int count=0;

            for (int j = 0; j < str.length() ; j++) {

                if(word.charAt(i)==str.charAt(j)) {

                    count++;
                }

            }
            result +=""+word.charAt(i)+count;

        }
        System.out.println(result);






    }
}
