package exersize_1;

public class RemoveX {

    public String stringX(String str) {

        for(int i=1; i<str.length()-1; i++){

            if(str.charAt(i)=='x'){
                str=str.replace("x","");
            }

        }

        return str;



    }

    public static void main(String[] args) {






    }

}
