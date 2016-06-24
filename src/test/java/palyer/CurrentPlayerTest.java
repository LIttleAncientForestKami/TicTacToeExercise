package palyer;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by kuba on 24.06.16.
 */
public class CurrentPlayerTest {

    @Test
    public void changeCurrentPlayerTest(){
        Player playerX = new Player(Mark.X);
        Player playerO = new Player(Mark.O);
        CurrentPlayer currentPlayer = new CurrentPlayer(playerX,playerO);
        Player playerChange1 = currentPlayer.changeCurrentPlayer();
        Player playerChange2 = currentPlayer.changeCurrentPlayer();

        assertEquals(playerChange1,playerO);
        assertEquals(playerChange2,playerX);
    }

}