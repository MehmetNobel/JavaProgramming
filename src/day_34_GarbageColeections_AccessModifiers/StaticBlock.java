package day_34_GarbageColeections_AccessModifiers;

public class StaticBlock {

    static{
        System.out.println("this is static block");
    }

    public StaticBlock(){
        System.out.println("this is constructor");
    }

    public static void main(String[] args) {

        System.out.println("this is main method");

        StaticBlock st=new StaticBlock(); // when we create the object the constructor gets executed.

        //System.out.println("st = " + st);


    }




}
