package day_18_NestedLoop;

public class WithoutDividing {

    public static void main(String[] args) {

        int n1=22;

        int n2=4;

        int result=n1;

        int count=0;

        while(n1>=n2) {

            n1 = n1-n2;

            count++;
        }
        System.out.println("division is : " + count);

        System.out.println("remainder is : " + n1);



    }
}
