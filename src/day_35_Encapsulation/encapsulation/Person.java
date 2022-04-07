package day_35_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName(){

        return name;
    }

    public int getAge(){

        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setage(int age){
        if(age>0&&age<150)   {
        this.age=age;}
        else {
            System.err.println("invalid age");
            System.exit(0);
        }
    }

    public String toString(){

        return " name : "+name+
                " age : "+age;

    }





}
