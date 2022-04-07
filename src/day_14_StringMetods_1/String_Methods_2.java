package day_14_StringMetods_1;

public class String_Methods_2 {

    public static void main(String[] args) {


        String str= "JAVA is fun";

        String str2=str.replace("JAVA","PYTHON");

        String str3="Java is enyoyable, you will like it. It makes ours works easier.. Does it?";

        System.out.println("str 3 length : " + str3.length());

        String str4=str3.replace("it", "IT");

        System.out.println("str3 = " + str3);

        System.out.println("str4 = " + str4);


        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


    }
}
