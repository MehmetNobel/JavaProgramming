package albertJavaTasks;

import java.util.*;

public class Mehmet {


    public static void main(String[] args) {

        Map<Character, String> connect=new HashMap<>();

        connect.put('a',"a");
        connect.put('c',"C");
        connect.put('z',null);
        connect.put('y',"yz");
        connect.put('y',connect.get('c'));

        System.out.println("connect.get('z')+connect.get('y')+connect.get('a') = " + connect.get('z') + connect.get('y') + connect.get('a'));



















      /*  try {
            int arr[] = new int[1];
            arr[1] = 5;
        }catch (Exception e){

            System.out.println("a");
    }  catch (RuntimeException e){

            System.out.println("b");
    }

       */


}



}
