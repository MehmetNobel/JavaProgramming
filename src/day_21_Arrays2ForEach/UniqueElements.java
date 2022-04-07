package day_21_Arrays2ForEach;

public class UniqueElements {

    public static void main(String[] args) {

        String words[]={"ahmet","esad","tuna","ahmet","tuna"};

        String result="";

        for (String word : words) {

            int count=0;

            for (String s : words) {

                if (word.equals(s)){

                    count++;
                }

            }

            if (count==1)
                result=word;



        }


        System.out.println(result);



    }
}
