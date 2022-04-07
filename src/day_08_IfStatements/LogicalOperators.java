package day_08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name="ahmet";

        String citizen="USA";

        int age=18;

        boolean eligible=age>=18&&citizen=="USA";

        System.out.println(name + " is eligible = " + eligible);

        int age2=23;

        String name2="Mehmet";

        int loanScore=720;

        int citizenSoccer=75;

        // we can control 3 situations at the same time..
        boolean isGetCredit=age2>=21&&loanScore>=700&&citizenSoccer>=70;

        System.out.println(name2+" isGetCredit = " + isGetCredit);

        String name3="Semih";

        String citizen2="UK";

        boolean isMarriedtOUsaCitizen=true;

        boolean isEligible=citizen2=="USA"||(isMarriedtOUsaCitizen);

        System.out.println(name3 + " isEligible = " + isEligible);

        String name5="Esad";

        double gpa=3.5;

        int familyIncome=30000;

        boolean isScolarship=gpa>=4||familyIncome<=40000;

        System.out.println(name5 + " isScolarship = " + isScolarship);







    }

}
