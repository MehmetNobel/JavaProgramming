package replit6;

import java.util.*;

public class Nanuk {

    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {

        int count = 0;
        int sum = 0;

        for (int i = 0; i < r.size(); i++) {

            if (r.get(i).equals("nanuk"))
                count++;

        }
        r.removeIf(p -> Character.isLetter(p.charAt(0)));

        for (String s : r) {
            sum += Integer.parseInt(s);
        }

        if ((sum >= boast) && (way_stones >= count))

            return true;
            return false;
    }
    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(nanuk(list, stones, boast));

    }

}
