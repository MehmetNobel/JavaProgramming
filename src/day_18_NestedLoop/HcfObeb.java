package day_18_NestedLoop;

public class HcfObeb {

    public static void main(String[] args) {

        int n1=140;

        int n2=210;

        int obeb=1;

        int min=(n1>n2)?n2:n1;

        for (int i = 1; i <min ; i++) {

            if (n1 % i == 0 && n2 % i == 0) {

                if (i > obeb) {
                    obeb = i;

                }
            }
        }

        System.out.println("hcf obeb is :" + obeb);


    }
}
