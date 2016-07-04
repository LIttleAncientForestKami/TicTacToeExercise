package com.epam.ticTacToe.board;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

/**
 * Created by damian on 24.06.16.
 */
public class GameBoardTest {

    private GameBoard mGameBoard;
    private int BOARD_SIZE = 3;

    @BeforeMethod
    public void setUp() {
        /**
         * Arrange
         */
        mGameBoard = new GameBoard(new BoardSize(BOARD_SIZE));
    }

    @Test
    public void validateBoardInitialization() {
        /**
         * Art
         */
        String result_123_456_789 = "123\n456\n789\n";
        /**
         * Assert
         */
        assertEquals(mGameBoard.toString(), result_123_456_789);
    }

    @Test
    public void appliesMarkOAtCenter() {
        /**
         * Art
         */
        mGameBoard.placeMark(FieldStatus.O, 5);
        /**
         * Assert
         */
        String result_123_4O6_789 = "123\n4O6\n789\n";
        assertEquals(mGameBoard.toString(), result_123_4O6_789);
    }

    @Test
    public void applies_O_X_O_X_sequenceOnBoard() {
        /**
         * Art
         */
        mGameBoard.placeMark(FieldStatus.O, 1);
        mGameBoard.placeMark(FieldStatus.X, 5);
        mGameBoard.placeMark(FieldStatus.O, 2);
        mGameBoard.placeMark(FieldStatus.X, 9);

        /**
         * Assert
         */
        String result_OO3_4X6_78X = "OO3\n4X6\n78X\n";
        assertEquals(mGameBoard.toString(), result_OO3_4X6_78X);
    }

    @AfterMethod
    public void tearDown() {
        mGameBoard = null;
    }
}