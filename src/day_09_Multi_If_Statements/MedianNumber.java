package day_09_Multi_If_Statements;

public class MedianNumber {

    public static void main(String[] args) {

        int x=28;

        int y=22;

        int z=30;

        boolean md_y=(z>y&&y>x)||(y>z&&y<x);
        boolean md_z=(z>x&&y>z)||(z<x&&z>y);
        boolean md_x=!md_y&&!md_z;           // kısa yoldan 2 si de doğru değilse medyan x tir demiş olduk.

        if(md_y) {

            System.out.println("median y = " + md_y);
        }
        if(md_x) {

            System.out.println("median x = " + md_x);
        }
        if(md_z) {

            System.out.println("median z = " + md_z);
        }


    }
}
