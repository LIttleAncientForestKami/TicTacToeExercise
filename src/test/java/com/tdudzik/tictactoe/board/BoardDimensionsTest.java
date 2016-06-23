package com.tdudzik.tictactoe.board;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BoardDimensionsTest {

    @Test
    public void createBoardDimensions() {
        // When
        BoardDimensions boardDimensions = BoardDimensions.of(3, 4);

        // Then
        assertEquals(3, boardDimensions.getX());
        assertEquals(4, boardDimensions.getY());
    }

}