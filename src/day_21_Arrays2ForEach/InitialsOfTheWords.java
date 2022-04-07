package day_21_Arrays2ForEach;

public class InitialsOfTheWords {

    public static void main(String[] args) {

        String str[]={"ahmet mehmet", "ayşe ay", "esad tuna",
                "zeynep safiye","jhj hgg","fdgfd 545","hilal deniz","toprak ay", "güneş fgfg", "dağ jhj"};

        for (String sting : str) {

            String st1=sting.charAt(0)+""+sting.charAt(sting.indexOf(" ")+1);

            //String st[]=sting.split(" ");

            //char ch2=st[1].charAt(0);


            System.out.print(st1);

        }




    }



}
