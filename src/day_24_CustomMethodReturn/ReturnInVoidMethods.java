package day_24_CustomMethodReturn;

public class ReturnInVoidMethods {

    public static void isEligible(String citizen, int age) {

        String result = "";

        if ((citizen.equalsIgnoreCase("usa") && age >= 20)) {

            result = "you are eligible to vote";

            System.out.println(result);

        } else {
            result = "you are not eligible to vote";

            System.out.println(result);

            return;

        }




    }


    public static void main(String[] args) {



        isEligible("turkey", 23 );




    }
}
