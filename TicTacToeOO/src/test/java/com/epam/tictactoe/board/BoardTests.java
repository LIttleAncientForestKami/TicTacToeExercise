package com.epam.tictactoe.board;

import com.epam.tictactoe.board.*;
import com.epam.tictactoe.enums.Sign;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Grzegorz Sledz
 */
public class BoardTests {

    @Test
    public void boardAfterCreationShouldBeEmpty() {
        IBoard board = new Board(new Dimension(3));
        Assert.assertFalse(board.checkIsFullyFilled());
    }
    @Test
    public void checkIsBoardFieldElementIsNotEmptyAfterPlacingMark() {
        IBoard board = new Board(new Dimension(3));
        IPosition position=new Position(5);
        Assert.assertTrue(board.placeMark(position,Sign.X));
        Assert.assertFalse(board.checkIsEmptyAt(position));
    }

    @Test
    public void doublePlaceMarkAtTheSamePositionShouldReturnFalse() {
        IBoard board = new Board(new Dimension(3));
        IPosition position=new Position(1);
        Assert.assertTrue(board.placeMark(position,Sign.X));
        Assert.assertFalse(board.placeMark(position,Sign.X));
    }

    @Test
    public void placeMarkAtOutOfBoundsShouldReturnFalse() {
        IBoard board = new Board(new Dimension(3));
        Assert.assertFalse(board.placeMark(new Position(0),Sign.X));
        Assert.assertFalse(board.placeMark(new Position(10),Sign.X));
    }


    @DataProvider(name = "board3x3WithOinTheMiddle")
    public Object[][] board3x3WithOinTheMiddle() {
        IBoard board = new Board(new Dimension(3));
        IPosition five=new Position(5);
        board.placeMark(five,Sign.O);
        return new Object[][] {{board}};
    }

    @Test(dataProvider = "board3x3WithOinTheMiddle")
    public void elementAtPositionFiveShouldBeSignO(IBoard board) {
        IPosition position=new Position(5);
        Sign expectedSign= Sign.O;
        Assert.assertEquals(board.elementAt(position),expectedSign);
    }
    @Test(dataProvider = "board3x3WithOinTheMiddle")
    public void toStringOfBoardWithSignOInTheMiddle(IBoard board) {
        Sign sign= Sign.O;
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("-|-|-\n-|O|-\n-|-|-\n");
        Assert.assertEquals(board.toString(),stringBuilder.toString());
        Assert.assertNotEquals(board.toString(),stringBuilder.toString().replaceAll("O","-"));
    }
}


