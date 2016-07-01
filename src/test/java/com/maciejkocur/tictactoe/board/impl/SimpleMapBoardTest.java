package com.maciejkocur.tictactoe.board.impl;

import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.board.Mark;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimpleMapBoardTest {

    @Test(dataProvider = "allMoves")
    public void appliesAnyMoveAtAnyEmptyField(Integer field, Mark mark) {
        //given
        Board board = createBoard();
        //when
        board.applyMark(field, mark);
        //then
        Assert.assertEquals(board.getMarkAtField(field), mark);
    }

    @Test(dataProvider = "oMoves")
    public void notAppliesOAtOccupiedField(Integer field, Mark mark) {
        //given
        Board board = createBoard(field(field, mark));
        //when
        board.applyMark(field, Mark.CROSS);
        //then
        Assert.assertEquals(board.getMarkAtField(field), mark);
    }


    @Test(dataProvider = "xMoves")
    public void notAppliesXAtOccupiedField(Integer field, Mark mark) {
        //given
        Board board = createBoard(field(field, mark));
        //when
        board.applyMark(field, Mark.CIRCLE);
        //then
        Assert.assertEquals(board.getMarkAtField(field), mark);
    }

    @Test
    public void printsEmptyBoard() {
        //given
        Board board = createBoard();
        //when
        String emptyStringBoard = board.toString();
        //then
        Assert.assertEquals(emptyStringBoard, "\t1\t2\t3\n\t4\t5\t6\n\t7\t8\t9\n");
    }

    @Test
    public void getAvailableMovesOnEmptyBoard() {
        //given
        Board board = createBoard();
        Set<Integer> expectedAvailableMoves = moves(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //when
        Set<Integer> availableFieldsOnEmptyBoard = board.getAvailableFields();
        //then
        Assert.assertEquals(availableFieldsOnEmptyBoard, expectedAvailableMoves);
    }

    @Test
    public void getAvailableMovesWithOneOccupiedField() {
        //given
        Board board = createBoard(field(1, Mark.CIRCLE));
        Set<Integer> expectedAvailableMoves = moves(2, 3, 4, 5, 6, 7, 8, 9);
        //when
        Set<Integer> availableFields = board.getAvailableFields();
        //then
        Assert.assertEquals(availableFields, expectedAvailableMoves);
    }

    @Test
    public void getAvailableMovesWithTwoOccupiedFields() {
        //given
        Board board = createBoard(field(1, Mark.CIRCLE), field(2, Mark.CIRCLE));
        Set<Integer> expectedAvailableMoves = moves(3, 4, 5, 6, 7, 8, 9);
        //when
        Set<Integer> availableFieldsOnEmptyBoard = board.getAvailableFields();
        //then
        Assert.assertEquals(availableFieldsOnEmptyBoard, expectedAvailableMoves);
    }

    @Test
    public void getAvailableMovesWithAllOccupiedFields() {
        //given
        Board board = createBoard(field(1, Mark.CIRCLE), field(2, Mark.CIRCLE), field(3, Mark.CIRCLE), field(4, Mark.CIRCLE),
                field(5, Mark.CIRCLE), field(6, Mark.CIRCLE), field(7, Mark.CIRCLE), field(8, Mark.CIRCLE), field(9, Mark.CIRCLE));
        Set<Integer> expectedAvailableMoves = moves();
        //when
        Set<Integer> availableFieldsOnEmptyBoard = board.getAvailableFields();
        //then
        Assert.assertEquals(availableFieldsOnEmptyBoard, expectedAvailableMoves);
    }

    @DataProvider(name = "allMoves")
    public static Object[][] allMoves() {
        Object[][] fields = new Object[18][2];
        for (int i = 0; i < 18; i++) {
            fields[i][0] = i + 1;
            fields[i][1] = Mark.CIRCLE;
        }
        for (int i = 0; i < 9; i++) {
            fields[i + 9][0] = i + 1;
            fields[i + 9][1] = Mark.CROSS;
        }
        return fields;
    }

    @DataProvider(name = "oMoves")
    public static Object[][] oMoves() {
        Object[][] fields = new Object[9][2];
        for (int i = 0; i < 9; i++) {
            fields[i][0] = i + 1;
            fields[i][1] = Mark.CIRCLE;
        }
        return fields;
    }

    @DataProvider(name = "xMoves")
    public static Object[][] xMoves() {
        Object[][] fields = new Object[9][2];
        for (int i = 0; i < 9; i++) {
            fields[i][0] = i + 1;
            fields[i][1] = Mark.CIRCLE;
        }
        return fields;
    }

    private Object field(int position, Mark mark) {
        return new Object[]{position, mark};
    }

    private Board createBoard(Object... objects) {
        Map<Integer, Mark> board = new HashMap<>();
        for (int i = 0; i < objects.length; i++) {
            Object[] field = (Object[]) objects[i];
            Integer position = (Integer) field[0];
            Mark mark = (Mark) field[1];
            board.put(position, mark);
        }
        return new SimpleMapBoard(board);
    }

    private Set<Integer> moves(int... moves) {
        HashSet<Integer> availableMoves = new HashSet<>();
        for (int move : moves) {
            availableMoves.add(move);
        }
        return availableMoves;
    }
}
