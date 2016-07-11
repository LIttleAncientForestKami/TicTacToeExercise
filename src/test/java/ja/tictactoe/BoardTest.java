package ja.tictactoe;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

    @Test
    public void TestIfOtherCellsAreEmpty() {

        // given
        Map<Position, Symbol> fieldstate = FieldFactory.createField();
        Board board = new Board(fieldstate);
        SoftAssert softAssert = new SoftAssert();

        // when and then
        softAssert.assertEquals(board.whatSymbolIsOnThePosition(ONE), EMPTY);
        softAssert.assertEquals(board.whatSymbolIsOnThePosition(TWO), EMPTY);
        softAssert.assertEquals(board.whatSymbolIsOnThePosition(FOUR), EMPTY);
        softAssert.assertEquals(board.whatSymbolIsOnThePosition(SEVEN), EMPTY);
        softAssert.assertEquals(board.whatSymbolIsOnThePosition(NINE), EMPTY);
        softAssert.assertAll();
    }

}
