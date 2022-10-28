package tiktaktoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tiktaktoe.Mark.*;

public class PlayerTest {
   private Mark [][]boardSurface;
   private Player player1;
   private Player player2;
   private Board board;

    @BeforeEach
    void setUp(){
        player1 = new Player(X);
        player2 = new Player(O);
        board = new Board();
       boardSurface = board.getBoardSurface();
    }

    @Test
    public void testThatThePlayersExist(){
        assertNotNull(player1);
        assertNotNull(player2);
    }
    @Test
    public void testThatTheBoardsCellsAreEmpty(){
        var boardSurface = board.getBoardSurface();
        assertEquals(E,boardSurface[0][0]);
        assertEquals(E,boardSurface[0][1]);
        assertEquals(E,boardSurface[0][2]);
        assertEquals(E,boardSurface[1][0]);
        assertEquals(E,boardSurface[1][1]);

    }

    @Test
     void testThatBoardCanBeDisplayed(){
        board.displayBoardSurface();
    }
    @Test
     void testThatXAppearsForPositionThatPlayer1Plays(){
        player1.playGame(8,board);
//        Mark [][]boardSurface  = board.getBoardSurface();
        assertEquals(X,boardSurface[2][1]);
    }
    @Test
     void testThatOAppearForPositionThatPlayer2Plays(){
//        Mark[][] boardSurface = board.getBoardSurface();
        for (int i = 1;i <10;i++){
            player2.playGame(i,board);

        }

        assertEquals(O,boardSurface[0][0]);
        assertEquals(O,boardSurface[0][1]);


    }
    @Test
    void testThatPlayer2CannotOverridePositionOfPlayer1(){
        player1.playGame(8,board);
        assertThrows(RuntimeException.class,()->player2.playGame(8,board));
        assertEquals(X,boardSurface[2][1]);

    }
    @Test
    void testThatNoPlayerShouldPlayAtAnInvalidPosition(){
        assertThrows(ArrayIndexOutOfBoundsException.class,()->player1.playGame(10,board));

    }
    @Test
    void  testThatTrueIsReturnedWhenOnePlayerPlaysAcrossRow0(){
        player1.playGame(1,board);
        player1.playGame(2,board);
        player1.playGame(3,board);
        assertTrue(board.isAWinner());
    }
    @Test
    void  testThatTrueIsReturnedWhenOnePlayerPlaysAcrossRow1(){
        player1.playGame(4,board);
        player1.playGame(5,board);
        player1.playGame(6,board);
        assertTrue(board.isAWinner());
    }

    @Test
    void  testThatTrueIsReturnedWhenOnePlayerPlaysAcrossRow2(){
        player1.playGame(7,board);
        player1.playGame(8,board);
        player1.playGame(9,board);
        assertTrue(board.isAWinner());
    }

    @Test
    void testThatIsTrueIsReturnedWhenOnePlayerPlaysAcrossColumnZero(){
        player1.playGame(1,board);
        player1.playGame(4,board);
        player1.playGame(7,board);
        assertTrue(board.isAWinner());
    }
    @Test
    void testThatIsTrueIsReturnedWhenOnePlayerPlaysAcrossColumn1(){
        player1.playGame(2,board);
        player1.playGame(5,board);
        player1.playGame(8,board);
        assertTrue(board.isAWinner());
    }

    @Test
    void testThatIsTrueIsReturnedWhenOnePlayerPlaysAcrossColumn2(){
        player1.playGame(3,board);
        player1.playGame(6,board);
        player1.playGame(9,board);
        assertTrue(board.isAWinner());
    }

    @Test
    void testThatIsTrueIsReturnedWhenOnePlayerPlaysAcrossBackwardDiagonal(){
        player1.playGame(1,board);
        player1.playGame(5,board);
        player1.playGame(9,board);
        assertTrue(board.isAWinner());
    }

    @Test
    void testThatIsTrueIsReturnedWhenOnePlayerPlaysAcrossForwardDiagonal(){
        player1.playGame(3,board);
        player1.playGame(5,board);
        player1.playGame(7,board);
        assertTrue(board.isAWinner());
    }
    @Test
    void testThatICanHaveATileWhenThereIsNoWinner(){
        player1.playGame(1,board);
        player1.playGame(2,board);
        player1.playGame(3,board);
        assertTrue(board.isAWinner());
    }




}
