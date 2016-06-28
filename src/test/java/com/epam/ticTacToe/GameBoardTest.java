package com.epam.ticTacToe;

import com.epam.ticTacToe.board.GameBoard;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by damian on 24.06.16.
 */
public class GameBoardTest {

    @Test
    public void appliesMarkOAtCenter() {
        /**
         * Arrange
         */
        GameBoard gameBoard = new GameBoard();
        /**
         * Art
         */
        gameBoard.placeMark("O");
        /**
         * Assert
         */
        String result_789_4O6_123 = "789\n4O6\n123\n";
        assertEquals(gameBoard.toString(), result_789_4O6_123);
    }
}