package exersize_1;

public class StringTimes {

    public int stringMatch(String a, String b) {

        int lengthMin = 0;

        int count = 0;

        if (a.length() < b.length())

            lengthMin = a.length();

        else

            lengthMin = b.length();

    //    String str2 = "";


        for (int i = 0; i < lengthMin; i++) {

            for (int j = 0; j < lengthMin; j++) {

                if (a.substring(i, i + 2).equals(b.substring(j, j + 2)))
                    count++;

            }

        }

        return count;
    }


    public static void main(String[] args) {

    }
}
