package tiktaktoe;

import java.util.Objects;

import static tiktaktoe.Mark.*;

public class Board {
    private final Mark[][] boardSurface= {{E,E,E},{E,E,E},{E,E,E}};
    private boolean isAWinner;

    public Mark[][] getBoardSurface() {

        return boardSurface;
    }

    public void displayBoardSurface() {
        for (int i = 0;i < 3;i++){
            System.out.print("| ");
            for (int j =0;j<3;j++){
                System.out.print(boardSurface[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
    public boolean isAWinner() {
        if (isAWinnerOnRowZero()) return true;
        if (isAWinnerOnRowOne()) return true;
        if (isAWinnerOnRowTwo()) return true;

        if (isAWinnerOnColumnZero()) return true;
        if (isAWinnerOnColumn1()) return true;
        if (isAWinnerOnColumn2()) return true;

        if (isAWinnerOnForwardDiagonal()) return true;
        if (isAWinnerOnBackwardDiagonal()) return true;
        else return false;
    }
    private boolean isAWinnerOnRowZero() {
        boolean isX =boardSurface[0][0] == X && boardSurface[0][1]==X && boardSurface[0][2]==X;
        boolean isO =boardSurface[0][0] == O && boardSurface[0][1]==O && boardSurface[0][2]==O;
        if (isX || isO)return true;
        else return false;

    }

    private boolean isAWinnerOnRowOne() {
        boolean isX =boardSurface[1][0] == X && boardSurface[1][1]==X && boardSurface[1][2]==X;
        boolean isO =boardSurface[1][0] == O && boardSurface[1][1]==O && boardSurface[1][2]==O;
        if (isX || isO)return true;
        else return false;
    }

    private boolean isAWinnerOnRowTwo() {
        boolean isX =boardSurface[2][0] == X && boardSurface[2][1]==X && boardSurface[2][2]==X;
        boolean isO =boardSurface[2][0] == O && boardSurface[2][1]==O && boardSurface[2][2]==O;
        if (isX || isO)return true;
        else return false;
    }

    private boolean isAWinnerOnColumnZero() {
        boolean isX =boardSurface[0][0] == X && boardSurface[1][0]==X && boardSurface[2][0]==X;
        boolean isO =boardSurface[0][0] == O && boardSurface[1][0]==O && boardSurface[2][0]==O;
        if (isX || isO)return true;
        else return false;
    }

    private boolean isAWinnerOnColumn1() {
        boolean isX =boardSurface[0][1] == X && boardSurface[1][1]==X && boardSurface[2][1]==X;
        boolean isO =boardSurface[0][1] == O && boardSurface[1][1]==O && boardSurface[2][1]==O;
        if (isX || isO)return true;
        else return false;
    }

    private boolean isAWinnerOnColumn2() {
        boolean isX =boardSurface[0][2] == X && boardSurface[1][2]==X && boardSurface[2][2]==X;
        boolean isO =boardSurface[0][2] == O && boardSurface[1][2]==O && boardSurface[2][2]==O;
        if (isX || isO)return true;
        else return false;
    }

    private boolean isAWinnerOnBackwardDiagonal() {
        boolean isX =boardSurface[0][0] == X && boardSurface[1][1]==X && boardSurface[2][2]==X;
        boolean isO =boardSurface[0][0] == O && boardSurface[1][1]==O && boardSurface[2][2]==O;
        if (isX || isO)return true;
        else return false;
    }

    private boolean isAWinnerOnForwardDiagonal() {
        boolean isX =boardSurface[0][2] == X && boardSurface[1][1]==X && boardSurface[2][0]==X;
        boolean isO =boardSurface[0][2] == O && boardSurface[1][1]==O && boardSurface[2][0]==O;
        if (isX || isO)return true;
        else return false;
    }
    public boolean isATile(){
        if (!isAWinner() && !isE())return true;
        else return false;
    }

    private boolean isE() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0;j < 3;j++){
                if (boardSurface[i][j] == E){
                    return true;
                }

            }
        }
        return false;
    }
}
