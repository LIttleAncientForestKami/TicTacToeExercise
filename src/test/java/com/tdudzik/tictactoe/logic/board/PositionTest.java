package com.tdudzik.tictactoe.logic.board;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PositionTest {

    @Test
    public void createPosition() {
        // When
        Position position = Position.of(10);

        // Then
        assertEquals(10, position.getValue());
    }

    @Test
    public void positionsAreEqualWhenTheyHaveTheSameValue() {
        // Given
        Position position = Position.of(3);
        Position position2 = Position.of(3);

        // When
        boolean positionsAreEqual = position.equals(position2);

        // Then
        assertTrue(positionsAreEqual);
    }

    @Test
    public void positionsAreNotEqualWhenTheyHaveNotTheSameValue() {
        // Given
        Position position = Position.of(3);
        Position position2 = Position.of(4);

        // When
        boolean positionsAreEqual = position.equals(position2);

        // Then
        assertFalse(positionsAreEqual);
    }

}