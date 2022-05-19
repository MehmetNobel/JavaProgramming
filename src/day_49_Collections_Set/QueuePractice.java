package day_49_Collections_Set;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> q1=new PriorityQueue<>(Arrays.asList(10,20,30,1,2,3,2,3,5));
        Queue<Integer> q2=new ArrayDeque<>(Arrays.asList(10,20,30,1,2,3,2,3,5));  // keeps the insertion order
        Queue<Integer> q3=new LinkedList<>(Arrays.asList(10,20,30,1,2,3,2,3,5));  // keeps the insertion order

        System.out.println("q1 = " + q1);
        System.out.println("q2 = " + q2);
        System.out.println("q3 = " + q3);

        q1.poll();     // to remove the last element
        q2.poll();    // to remove the last element
        q3.poll();    // to remove the last element

        System.out.println("q1 = " + q1);
        System.out.println("q2 = " + q2);
        System.out.println("q3 = " + q3);

        List<Integer> v1=new Vector<>(Arrays.asList(1,2,3,3,4,4,5,6,6,7));

        System.out.println("v1 = " + v1);

        List<Integer> v2=new Stack<Integer>();  // burada poly var; eklemek için downcasting yapmalıyız.Çünkü stakin metotları listte yok.
        //listi implemente ettiği için poly rules geregi ancak listin metotlarını görebilir.

        // Stack<Integer> v3=new Stack<Integer>();   burada sorun yok

        //downcasting yapmak istemiyorsak direk objesiden üretmeliyiz.

        ((Stack<Integer>) v2).push(1); // listeye ekler

        ((Stack<Integer>) v2).push(3);   // list

        System.out.println("v2 = " + v2);

        System.out.println("v2.peek() = " + ((Stack<Integer>) v2).peek());  // son eleman hangisiyse onu verir.

        ((Stack<Integer>) v2).pop();   // son elemanı listeden çıkardı

        System.out.println("v2 = " + v2);


    }
}
