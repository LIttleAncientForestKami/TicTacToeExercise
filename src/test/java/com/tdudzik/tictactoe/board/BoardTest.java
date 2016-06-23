package com.tdudzik.tictactoe.board;

import com.tdudzik.tictactoe.board.Board;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;
import static org.testng.AssertJUnit.assertTrue;

public class BoardTest {

    @Test
    public void checkIfPositionExists() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(1), Mark.NONE);

        Board board = new Board(marksByPositions);

        // When
        boolean positionExists = board.positionExists(Position.of(1));

        // Then
        assertTrue(positionExists);
    }

    @Test
    public void checkIfPositionDoesNotExists() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(1), Mark.NONE);

        Board board = new Board(marksByPositions);

        // When
        boolean positionExists = board.positionExists(Position.of(2));

        // Then
        assertFalse(positionExists);
    }

    @Test
    public void checkIfPositionThatExistsIsOccupied() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(5), Mark.O);

        Board board = new Board(marksByPositions);

        // When
        boolean isOccupied = board.isOccupied(Position.of(5));

        // Then
        assertTrue(isOccupied);
    }

    @Test
    public void checkIfPositionThatExistsIsNotOccupied() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(5), Mark.NONE);

        Board board = new Board(marksByPositions);

        // When
        boolean isOccupied = board.isOccupied(Position.of(5));

        // Then
        assertFalse(isOccupied);
    }

    @Test
    public void checkIfPositionThatDoesNotExistIsOccupied() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(5), Mark.O);

        Board board = new Board(marksByPositions);

        // When
        try {
            boolean isOccupied = board.isOccupied(Position.of(1));

            // Then
            fail("Should throw an IllegalStateException.");
        } catch (IllegalArgumentException ex) {
            // Ok
        }
    }

}