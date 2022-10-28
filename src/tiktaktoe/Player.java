package tiktaktoe;

import static tiktaktoe.Mark.*;

public class Player {
    private final Mark mark;
    public Player(Mark mark){
    this.mark = mark;

    }
    public void playGame(int boardPosition,Board board) {
       if (boardPosition <= 0 || boardPosition > 9)throw new ArrayIndexOutOfBoundsException("position invalid");
        else{
           var boardSurface = board.getBoardSurface();
           int row = 0;
           int col = boardPosition -1;

           if (boardPosition > 3){
               row = 1;
               col = boardPosition -4;

           }
           if (boardPosition > 6){
               row = 2;
               col = boardPosition - 7;
           }
           if (boardSurface[row][col] ==E ){
               boardSurface[row][col] = mark;
           }else {
               throw new RuntimeException("this position has been placed in it");
           }

       }


    }




}
