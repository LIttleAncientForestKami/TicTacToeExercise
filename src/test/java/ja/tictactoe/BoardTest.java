package ja.tictactoe;

import org.testng.annotations.Test;

import java.util.Map;

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
        Map<Position, Symbol> fieldstate = FieldFactory.createField();
        Board board = new Board(fieldstate);

        // when
        Symbol symbolInTheCentre = board.whatSymbolIsOnThePosition(FIVE);

        // then
        assertEquals(symbolInTheCentre, O);
    }



}
