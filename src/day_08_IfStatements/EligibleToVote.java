package day_08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        System.out.println(!true);

        System.out.println(!!!!true);

        String name = "ahmet";

        int age = 42;

        String citizen = "USA";

        boolean isEligible=age>=18&&citizen=="USA";

        if (isEligible) {

            System.out.println(name + " isEligible = " + isEligible);
        }
        if (!isEligible) {

            System.out.println(name + " isEligible = " + isEligible);
        }
    }
}
