package day_24_CustomMethodReturn;

public class WarmUpTests {


    public static void initials(String firstName, String lastName) {

        String firstAndLast = firstName.charAt(0) + " . " + lastName.charAt(0);

        System.out.println(firstAndLast);


    }

    public static void getDomain(String str) {

        str = str.substring(str.indexOf("@") + 1, str.lastIndexOf("."));

        System.out.println(str);

    }

    public static void main(String[] args) {

        initials("MEHMET", "NOBEL");

        getDomain("mehmetnobel@gmail.com");

        String emails[] = {"mehmetnoble@gmail.com", "zeynep@hotmail.com", "esad@gmail.com", "ayse@yahoo.com"};

        for (String email : emails) {

            getDomain(email);
        }


    }
}
