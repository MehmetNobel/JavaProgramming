package replit5;

public class FindTheLengthOfTheArray {

    public static String scalar(int[][] matrix) {

        int k = 0;
        int l1=0;
        int l = 0;

        for (int[] ints : matrix) {
            k++;l=0;
            for (int anInt : ints) {
                l++;

            }
            l1=l;
        }
        return " k :" + k + " l :" + l1;
    }

    public static void main(String[] args) {

        System.out.println("scalar(new int[][]{{1,2,3},{4,5,6}}) = " + scalar(new int[][]{{1, 2, 3}, {4, 5, 6}}));


    }
}
