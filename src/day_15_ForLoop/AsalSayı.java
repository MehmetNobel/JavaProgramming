package day_15_ForLoop;

public class AsalSayı {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            int k = 0;

            for (int j = 1; j <=100 ; j++) {

                if(i%j==0){
                    k++;
                }

            }
            if(k==2)
                System.out.println(i + " asal sayıdır");


        }


    }
}
