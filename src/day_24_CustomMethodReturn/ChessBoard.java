package day_24_CustomMethodReturn;

import java.util.Arrays;

public class ChessBoard {

    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        for (int i = 0; i < chessBoard.length; i++) {


            char ch = 'a';

            for (int i1 = 0; i1 < chessBoard[i].length; i1++) {

                chessBoard[i][i1] = "" + i + ch++;


            }

        }

        System.out.println(Arrays.deepToString(chessBoard));
    }
}

