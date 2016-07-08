package ja.tictactoe;

import org.testng.annotations.Test;

import static ja.tictactoe.Symbol.*;
import static ja.tictactoe.Position.*;
import static org.testng.Assert.*;

/**
 * Created by Olga Ermolaeva on 07.07.16.
 */
public class BoardTest {

    @Test
    public void TestIfOisInTheCentre() {

        // given
        Board board = new Board();

        // when
        Symbol symbolInTheCentre = board.whatSymbolIsOnThePosition(FIVE);

        // then
        assertEquals(symbolInTheCentre, O);
    }

}
