package day_24_CustomMethodReturn;

public class FrequencyOfTheChar {


    public static int frequency(String word, char ch){

        int frequency=0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i)==ch)

                frequency++;
        }

        return frequency;

    }

    public static void main(String[] args) {

        System.out.println(frequency("ahmet arslan", 'a'));


        String str2="ahmet mehmetler";

        for (int i = 0; i <str2.length() ; i++) {

           if(frequency(str2, str2.charAt(i))==1)

               System.out.println(str2.charAt(i));


        }





    }
}
