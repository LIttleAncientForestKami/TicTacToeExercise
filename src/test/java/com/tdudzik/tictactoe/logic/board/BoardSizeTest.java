package com.tdudzik.tictactoe.logic.board;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BoardSizeTest {

    @Test
    public void createBoardSize() {
        assertEquals(3, BoardSize.of(3).getValue());
    }

    @Test
    public void boardSizesAreEqualWhenTheyHaveTheSameValue() {
        // Given
        BoardSize boardSize = BoardSize.of(3);
        BoardSize boardSize2 = BoardSize.of(3);

        // When
        boolean boardSizesAreEqual = boardSize.equals(boardSize2);

        // Then
        assertTrue(boardSizesAreEqual);
    }

    @Test
    public void boardSizesAreNotEqualWhenTheyHaveNotTheSameValue() {
        // Given
        Position boardSize = Position.of(3);
        Position boardSize2 = Position.of(4);

        // When
        boolean boardSizesAreEqual = boardSize.equals(boardSize2);

        // Then
        assertFalse(boardSizesAreEqual);
    }

}