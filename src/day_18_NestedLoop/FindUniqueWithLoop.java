package day_18_NestedLoop;

public class FindUniqueWithLoop {

    public static void main(String[] args) {

        String str="aabbccdef";

        int count =0;

        for (int i = 0; i <str.length()-1 ; i++) {

            char ch=str.charAt(i);

            if (!(str.substring(i+1).contains(ch+""))) {

                System.out.print(str.charAt(i)+"");

                count++;
            }

        }

        //System.out.println("count : " + count);





    }
}
