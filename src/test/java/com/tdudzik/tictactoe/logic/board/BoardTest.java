package com.tdudzik.tictactoe.logic.board;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;
import static org.testng.AssertJUnit.assertTrue;

public class BoardTest {

    private final BoardDataProvider boardDataProvider = new BoardDataProvider();

    @DataProvider
    public Object[][] sameMarksHorizontally() {
        return boardDataProvider.sameMarksHorizontally();
    }

    @DataProvider
    public Object[][] sameMarksVertically() {
        return boardDataProvider.sameMarksVertically();
    }

    @DataProvider
    public Object[][] noSameMarks() {
        return boardDataProvider.noSameMarks();
    }

    @Test
    public void getBoardSizeOfBoard() {
        // Given
        Board board = new Board(BoardSize.of(3), new HashMap<>());

        // When
        BoardSize boardSize = board.getSize();

        // Then
        assertEquals(BoardSize.of(3), boardSize);
    }

    @Test
    public void createBoardFromBoardDimensions() {
        // When
        Board board = Board.from(BoardSize.of(3));

        // Then
        assertFalse(board.positionExists(Position.of(0)));
        assertTrue(board.positionExists(Position.of(1)) && !board.isOccupied(Position.of(1)));
        assertTrue(board.positionExists(Position.of(5)) && !board.isOccupied(Position.of(5)));
        assertTrue(board.positionExists(Position.of(9)) && !board.isOccupied(Position.of(9)));
        assertFalse(board.positionExists(Position.of(10)));
    }

    @Test
    public void positionExists() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(1), Mark.NONE);

        Board board = new Board(BoardSize.of(1), marksByPositions);

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

        Board board = new Board(BoardSize.of(1), marksByPositions);

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

        Board board = new Board(BoardSize.of(1), marksByPositions);

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

        Board board = new Board(BoardSize.of(1), marksByPositions);

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

        Board board = new Board(BoardSize.of(1), marksByPositions);

        // When
        try {
            boolean isOccupied = board.isOccupied(Position.of(1));

            // Then
            fail("Should throw an IllegalStateException.");
        } catch (IllegalStateException ex) {
            // Ok
        }
    }

    @Test
    public void markOnThePositionThatExists() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(5), Mark.X);

        Board board = new Board(BoardSize.of(1), marksByPositions);

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

        Board board = new Board(BoardSize.of(1), marksByPositions);

        // When
        try {
            Mark mark = board.markOn(Position.of(6));

            // Then
            fail("Should throw an IllegalStateException.");
        } catch (IllegalStateException ex) {
            // Ok
        }
    }

    @Test
    public void placeMarkOnThePositionThatExistsAndIsNotOccupied() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(5), Mark.NONE);

        Board board = new Board(BoardSize.of(1), marksByPositions);

        // When
        board.placeMark(Position.of(5), Mark.O);

        // Then
        assertTrue(board.isOccupied(Position.of(5)));
        assertEquals(Mark.O, board.markOn(Position.of(5)));
    }

    @Test
    public void placeMarkOnThePositionThatExistsAndOccupied() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        marksByPositions.put(Position.of(5), Mark.X);

        Board board = new Board(BoardSize.of(1), marksByPositions);

        // When
        try {
            board.placeMark(Position.of(5), Mark.O);

            // Then
            fail("Should throw an IllegalStateException.");
        } catch (IllegalStateException ex) {
            // Ok
        }
    }

    @Test
    public void placeMarkOnThePositionThatDoesNotExist() {
        // Given
        Map<Position, Mark> marksByPositions = new HashMap<>();
        Board board = new Board(BoardSize.of(0), marksByPositions);

        // When
        try {
            board.placeMark(Position.of(5), Mark.O);

            // Then
            fail("Should throw an IllegalStateException.");
        } catch (IllegalStateException ex) {
            // Ok
        }
    }

    @Test(dataProvider = "sameMarksHorizontally")
    public void checkIfThereAreTheSameMarksHorizontally(Map<Position, Mark> marksByPosition, int numberOfMarks, boolean thereShouldBeSameMarksHorizontally) {
        // Given
        BoardSize boardSizeMock = mock(BoardSize.class);
        Board board = new Board(boardSizeMock, marksByPosition);

        // When
        boolean thereAreSameMarksHorizontally = board.thereAreTheSameMarksSideBySideHorizontally(numberOfMarks);

        // Then
        assertEquals(thereShouldBeSameMarksHorizontally, thereAreSameMarksHorizontally);
    }

    @Test(dataProvider = "noSameMarks")
    public void checkIfThereAreNotSameMarksHorizontally(Map<Position, Mark> marksByPosition, int numberOfMarks, boolean thereShouldBeSameMarksHorizontally) {
        // Given
        BoardSize boardSizeMock = mock(BoardSize.class);
        Board board = new Board(boardSizeMock, marksByPosition);

        // When
        boolean thereAreSameMarksHorizontally = board.thereAreTheSameMarksSideBySideHorizontally(numberOfMarks);

        // Then
        assertEquals(thereShouldBeSameMarksHorizontally, thereAreSameMarksHorizontally);
    }

    @Test(dataProvider = "sameMarksVertically")
    public void check_if_there_are_same_marks_vertically(Map<Position, Mark> marksByPosition, int numberOfMarks, boolean thereShouldBeSameMarksVertically) {
        // Given
        BoardSize boardSizeMock = mock(BoardSize.class);
        Board board = new Board(boardSizeMock, marksByPosition);

        // When
        boolean thereAreSameMarksVertically = board.thereAreTheSameMarksSideBySideVertically(numberOfMarks);

        // Then
        assertEquals(thereShouldBeSameMarksVertically, thereAreSameMarksVertically);
    }

    @Test(dataProvider = "noSameMarks")
    public void check_if_there_are_not_same_marks_vertically(Map<Position, Mark> marksByPosition, int numberOfMarks, boolean thereShouldBeSameMarksVertically) {
        // Given
        BoardSize boardSizeMock = mock(BoardSize.class);
        Board board = new Board(boardSizeMock, marksByPosition);

        // When
        boolean thereAreSameMarksVertically = board.thereAreTheSameMarksSideBySideVertically(numberOfMarks);

        // Then
        assertEquals(thereShouldBeSameMarksVertically, thereAreSameMarksVertically);
    }

}
