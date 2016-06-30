package com.epam.ticTacToe;

import com.epam.ticTacToe.board.GameBoard;
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
        mGameBoard = new GameBoard(BOARD_SIZE);
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
        mGameBoard.placeMark("O", 5);
        /**
         * Assert
         */
        String result_123_4O6_789 = "123\n4O6\n789\n";
        assertEquals(mGameBoard.toString(), result_123_4O6_789);
    }

    @AfterMethod
    public void tearDown() {
        mGameBoard = null;
    }
}