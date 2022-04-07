package day_13_String;

public class CharAtMethod {

    public static void main(String[] args) {


        String name="Ahmet";

        String surname="Arslan";

        char f=name.charAt(0);

        char l=surname.charAt(0);

        String result=f+"."+l;

        System.out.println(result);


        String name1="Ahmet";

        String name2="Ahmet"; // name 1 name 2 string pool da tutuluyorlar, double quote ile üretildikleri için.

        String name3=new String("Ahmet");  // regular object üretimi ile üretildikleri için string pool da tutulmuyorlar. başka bir obje üretilmiş oluyor.

// o yüzden farklılar.

        System.out.println(name1==name2);

        System.out.println(name2==name3);

        String name5="java prog";

        char lastchar=name5.charAt(name5.length()-1);

        System.out.println("lastchar = " + lastchar);




    }





}
