package replit4;

public class ShortestWordBurak {

    public static void main(String[] args) {

        String str = "java, cable, red, vivid, ben, ten, remedy, grace";
        String[] arr = str.split(", ");
        String shortest = str;
        for (String value : arr) {
            shortest = value.length() < shortest.length() ? value : shortest;
        }
        System.out.println(shortest);
    }
}