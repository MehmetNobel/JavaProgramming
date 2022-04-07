package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElementsShortSolution {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 6, 5, 6, 10, 11));

        ArrayList<Integer> unique=new ArrayList<>(list);

        System.out.println("unique = " + unique);

        unique.removeIf(p-> Collections.frequency(list,p)>1);   // loop kullanmadan çözdük. lamda experission
        //implicitly loop kullanıyor.

        System.out.println(unique);

        String str="aabbccdeefg";
                                                // variable atamadan direk parantez içine yazıyoruz. bunu ==>>str.split("")
        ArrayList<String> list2=new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println("list2 = " + list2);

        list2.removeIf(p->Collections.frequency(list2,p)>1);

        System.out.println("list2 = " + list2);


    }
}
