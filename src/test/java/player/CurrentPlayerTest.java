package player;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CurrentPlayerTest {

    @Test
    public void changeCurrentPlayerTest(){
        Player playerX = new Player(Mark.X);
        Player playerO = new Player(Mark.O);
        CurrentPlayer currentPlayer = new CurrentPlayer(playerX,playerO);
        currentPlayer.changeCurrentPlayer();
        Player playerChange1 = currentPlayer.getCurrentPlayer();
        currentPlayer.changeCurrentPlayer();
        Player playerChange2 = currentPlayer.getCurrentPlayer();

        assertEquals(playerChange1,playerO);
        assertEquals(playerChange2,playerX);
    }

}