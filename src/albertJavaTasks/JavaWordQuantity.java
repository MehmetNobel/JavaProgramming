package albertJavaTasks;

public class JavaWordQuantity {

    public static void main(String[] args) {


        String str = "how many times java java java displayed?";

        String[] arr = str.split(" ");

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("java")) {
                count++;
            }

        }

        System.out.println("count = " + count);

        count=0;

        for (String s : arr) {
            if(s.equals("java"))
                count++;

        }

        System.out.println("count = " + count);


        count=0;

        for (int i = 0; i <str.length()-4 ; i++) {

            if(str.substring(i,i+4).equals("java"))
                count++;
        }

        System.out.println("count = " + count);


    }
}
