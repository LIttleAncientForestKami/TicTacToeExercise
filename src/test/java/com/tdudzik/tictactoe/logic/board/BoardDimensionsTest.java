package com.tdudzik.tictactoe.logic.board;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BoardDimensionsTest {

    @Test
    public void calculateNumberOfPositions() {
        // Given
        BoardDimensions boardDimensions = BoardDimensions.of(3, 3);

        // When
        int numberOfPositions = boardDimensions.numberOfPositions();

        // Then
        assertEquals(9, numberOfPositions);
    }

}