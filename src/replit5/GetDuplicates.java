package replit5;

import java.util.Scanner;

class GetDuplicates{

public static int getDuplicates(String[] r) {


    String result="";

    for (int i = 0; i < r.length; i++) {

        if(!result.contains(r[i]))
            result+=r[i];

    }

    String resultArray[]=result.split("");


        int countLast=0;

        for(int i=0; i< resultArray.length; i++) {  // 1  2  3
            int count=0;

            for(int j=0; j<r.length; j++) {   // 1   2   2  3

                if(resultArray[i].equals(r[j]))
                    count++;

            }

            if(count==2)
                countLast+=2;

        }

        return countLast;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDuplicates(strs));

    }

}