package model;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Board implements Serializable {
    private char[][] board;
    private String player1;
    private String player2;
    private boolean Turn;

    public Board(){
        this.board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

    }

    public void setNames(String Player1, String Player2){
        this.player1 = Player1;
        this.player2 = Player2;
    }

    public void printBoard(){
        System.out.println(Arrays.deepToString(this.board));
    }

    public void changeTurn(){
        this.Turn = !this.Turn;
    }

    public void Insert11() {
        if (Turn) {
            this.board[0][0] = 'O';
        } else{
            this.board[0][0] = 'X';
        }
    }

    public void Insert12() {
        if (Turn) {
            this.board[0][1] = 'O';
        } else{
            this.board[0][1] = 'X';
        }
    }

    public void Insert13() {
        if (Turn) {
            this.board[0][2] = 'O';
        } else{
            this.board[0][2] = 'X';
        }
    }

    public void Insert21() {
        if (Turn) {
            this.board[1][0] = 'O';
        } else{
            this.board[1][0] = 'X';
        }
    }

    public void Insert22() {
        if (Turn) {
            this.board[1][1] = 'O';
        } else{
            this.board[1][1] = 'X';
        }
    }

    public void Insert23() {
        if (Turn) {
            this.board[1][2] = 'O';
        } else{
            this.board[1][2] = 'X';
        }
    }

    public void Insert31() {
        if (Turn) {
            this.board[2][0] = 'O';
        } else{
            this.board[2][0] = 'X';
        }
    }

    public void Insert32() {
        if (Turn) {
            this.board[2][1] = 'O';
        } else{
            this.board[2][1] = 'X';
        }
    }

    public void Insert33() {
        if (Turn) {
            this.board[2][2] = 'O';
        } else{
            this.board[2][2] = 'X';
        }
    }


}
