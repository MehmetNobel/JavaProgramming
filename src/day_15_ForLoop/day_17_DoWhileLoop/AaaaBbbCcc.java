package day_15_ForLoop.day_17_DoWhileLoop;

public class AaaaBbbCcc {

    public static void main(String[] args) {
        String word="aaabbcccdd";
        int count=1;
        String res="";
        for (int i = 0; i < word.length()-1; i++) {
            if(word.charAt(i)==word.charAt(i+1)) {
                count++;
                continue;
            }else {
                res=res+word.charAt(i)+count;
            }
            count=1;
        }
        res=res+word.charAt(word.length()-1);
        System.out.println("result = " + res);
    }
}




