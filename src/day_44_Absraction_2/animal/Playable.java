package day_44_Absraction_2.animal;

public interface Playable {

     void playable();  // by default  method is already defined as public abstractint

   //  int a=5;   by default it will be defined as static and final

      static void method1(){
          System.out.println("can eat meat-1");
     }

     default void method2(){
          System.out.println("can eat meat-2");
     }



}