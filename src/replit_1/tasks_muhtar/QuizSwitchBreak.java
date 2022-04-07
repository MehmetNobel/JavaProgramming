package replit_1.tasks_muhtar;

public class QuizSwitchBreak {

    public static void main(String[] args) {


        int num = 2;

        boolean b = true;

        switch (num) {

            case 0:
                b = false;
            case 1:
                System.out.println(1);

            case 2:
                if (b) {
                    System.out.println(2);
                }
            case 3:
                if (b) {
                    System.out.println(3);
                    b = false;
                }

            case 4:

                if(!b){
                    break;
                }

                System.out.println(5);

        }


    }
}
