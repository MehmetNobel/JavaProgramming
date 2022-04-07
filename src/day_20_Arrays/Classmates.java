package day_20_Arrays;

public class Classmates {

    public static void main(String[] args) {

        String classmates[]={"mehmet", "ali", "mehmet","eray", "latif", "coşkun","omer"};

        String result="";

        for (int i = 0; i < classmates.length; i++) {

            result +=classmates[i].substring(0,1)+" ";

        }
        System.out.println(result);




    }
}
