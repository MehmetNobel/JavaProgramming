package day_37_Inheritance_2.myWalletTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyWallet {

    public static void main(String[] args) {


        Bitcoin bit=new Bitcoin(50000,12,10,10,2,true);
        Etherium etherium=new Etherium(40000,12,10,10,2,true);
        Bitcoin bit2=new Bitcoin(50000,12,10,10,2,true);
        Etherium etherium2=new Etherium(40000,12,10,10,2,true);
        Bitcoin bit3=new Bitcoin(50000,12,10,10,2,true);
        Etherium etherium3=new Etherium(40000,12,10,10,2,true);


        ArrayList<CryptoToken> list=new ArrayList<>();

        list.addAll(Arrays.asList(bit,bit2, bit3, etherium,etherium2,etherium3));


        System.out.println("bit.totalPrice() = " + bit.totalPrice());
        System.out.println("etherium.totalPrice() = " + etherium.totalPrice());

        System.out.println("bit = " + bit);

        System.out.println("etherium = " + etherium);

        System.out.println("****************************");

        double sum=0;

        for (CryptoToken cryptoToken : list) {

            sum+=cryptoToken.price;

        }
        System.out.println("sum = " + sum);

    }



}
