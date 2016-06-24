package board;

import com.danielzaucha.game.tictactoe.board.Board;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by daniel on 24.06.16.
 */
@Test()
public class BoardTest {

    @Test
    public void checkBoardOutput()
    {
        String result = "1 2 3 \n4 5 6 \n7 8 9";

        assertEquals(result, new Board(3).toString().substring(0, 19));
    }
}
