package day_35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1=new Person();

        p1.setName("mehmet");

        p1.setage(50);  // when we enter age as 50 then it gives invalid age as a reslt

        System.out.println("p1.getName() = " + p1.getName());

        System.out.println("p1 = " + p1);

        p1.setage(40);
        p1.setName("ahmet");

        System.out.println("p1 = " + p1);



    }


}
