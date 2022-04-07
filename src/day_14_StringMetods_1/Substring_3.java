package day_14_StringMetods_1;

public class Substring_3 {

    public static void main(String[] args) {

        String mail="cydeo.school@hotmail.com";

        String domain=mail.substring(mail.indexOf("@")+1,mail.lastIndexOf("."));

        System.out.println("domain = " + domain);

        String sentence="Java is fun, Java is cool, Java is easy";

        String part1=sentence.substring(0,sentence.indexOf(","));

        System.out.println("part1 = " + part1);

        String part2=sentence.substring(sentence.indexOf(",")+2,sentence.lastIndexOf(","));

        System.out.println("part2 = " + part2);

        String part3=sentence.substring(sentence.lastIndexOf(",")+2);

        System.out.println("part3 = " + part3);

        String s="Java";

        System.out.println(s.repeat(5));

        System.out.println((s+" ").repeat(5));  // concatenation uyguladık (s+  " ") ile






    }




}
