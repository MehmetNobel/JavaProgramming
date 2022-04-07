package replit6;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] game = new char[9];
        for(int i=0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }

    public static String won(char[] x){

            char ch='a';

            for (int i = 0, j=0; i <3 ; i++, j+=3) {

                if(x[i]==x[i+1]&&x[i]==x[i+2])
                    ch=x[i];
                else if(x[j]==x[j+3]&&x[j]==x[j+6])
                    ch=x[j];
                else if(x[2]==x[4]&&x[2]==x[6])
                    ch=x[2];
                else if(x[0]==x[4]&&x[0]==x[8])
                    ch=x[0];


            }

            return "Player "+ch+" won";
        }

}