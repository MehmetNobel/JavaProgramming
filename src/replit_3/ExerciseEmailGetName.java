package replit_3;

public class ExerciseEmailGetName{

    public static void main(String[] args) {


        String str = "I have coded [pyhton] today a lot.";

        String str2 = str.substring(str.indexOf("[") + 1, str.indexOf("]"));

        System.out.println("str2 = " + str2);

        String email = "crediric_fredie@gmail.com";

        String name=email.substring(0,email.indexOf("_"));

        String surname=email.substring(email.indexOf("_")+1,email.indexOf("@"));

        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        String newName=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();

        String newSurname=surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();

        System.out.println("newName = " + newName);

        System.out.println("newSurname = " + newSurname);

        System.out.println("domain = " + domain);


    }
}
