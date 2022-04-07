package day_15_ForLoop;

public class equals_contains_methods {

    public static void main(String[] args) {

        System.out.println("yes".equals("yeS"));

        System.out.println("YES".equalsIgnoreCase("yes"));

        String s1 = "java is a favourite programming language";

        System.out.println(s1.contains("fav"));

        System.out.println(s1.toUpperCase().contains("JAVA"));// önce uppercase e cevirip sonra içerip içermediğine bakıyoruz.


    }
}
