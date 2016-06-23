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
    public void ositionExists() {
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
    public void positionDoesNotExists() {
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
    public void positionThatExistsIsOccupied() {
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
    public void positionThatExistsIsNotOccupied() {
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
    public void positionThatDoesNotExistIsOccupied() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(5), Mark.O);

        Board board = new Board(marksByPositions);

        // When
        try {
            boolean isOccupied = board.isOccupied(Position.of(1));

            // Then
            fail("Should throw an IllegalArgumentException.");
        } catch (IllegalArgumentException ex) {
            // Ok
        }
    }

    @Test
    public void markOnThePositionThatExists() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(5), Mark.X);

        Board board = new Board(marksByPositions);

        // When
        Mark mark = board.markOn(Position.of(5));

        // Then
        assertEquals(Mark.X, mark);
    }

    @Test
    public void markOnThePositionThatDoesNotExists() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(5), Mark.O);

        Board board = new Board(marksByPositions);

        // When
        try {
            Mark mark = board.markOn(Position.of(6));

            // Then
            fail("Should throw an IllegalArgumentException.");
        } catch (IllegalArgumentException ex) {
            // Ok
        }
    }

}