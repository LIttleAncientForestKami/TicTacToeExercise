package com.maciejkocur.tictactoe.board.impl;

import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.board.Mark;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimpleMapBoardTest {

    @Test(dataProvider = "allMoves")
    public void appliesAnyMoveAtAnyEmptyField(Field field, Mark mark) {
        //given
        Board board = createBoard();
        //when
        board.applyMark(field, mark);
        //then
        Assert.assertEquals(board.getMarkAtField(field), mark);
    }

    @Test(dataProvider = "oMoves")
    public void notAppliesOAtOccupiedField(Field field, Mark mark) {
        //given
        Board board = createBoard(move(field.value(), mark));
        //when
        board.applyMark(field, Mark.CROSS);
        //then
        Assert.assertEquals(board.getMarkAtField(field), mark);
    }


    @Test(dataProvider = "xMoves")
    public void notAppliesXAtOccupiedField(Field field, Mark mark) {
        //given
        Board board = createBoard(move(field.value(), mark));
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
        Set<Field> expectedAvailableMoves = moves(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //when
        Set<Field> availableFieldsOnEmptyBoard = board.getAvailableFields();
        //then
        Assert.assertEquals(availableFieldsOnEmptyBoard, expectedAvailableMoves);
    }

    @Test
    public void getAvailableMovesWithOneOccupiedField() {
        //given
        Board board = createBoard(move(1, Mark.CIRCLE));
        Set<Field> expectedAvailableMoves = moves(2, 3, 4, 5, 6, 7, 8, 9);
        //when
        Set<Field> availableFields = board.getAvailableFields();
        //then
        Assert.assertEquals(availableFields, expectedAvailableMoves);
    }

    @Test
    public void getAvailableMovesWithTwoOccupiedFields() {
        //given
        Board board = createBoard(move(1, Mark.CIRCLE), move(2, Mark.CIRCLE));
        Set<Field> expectedAvailableMoves = moves(3, 4, 5, 6, 7, 8, 9);
        //when
        Set<Field> availableFieldsOnEmptyBoard = board.getAvailableFields();
        //then
        Assert.assertEquals(availableFieldsOnEmptyBoard, expectedAvailableMoves);
    }

    @Test
    public void getAvailableMovesWithAllOccupiedFields() {
        //given
        Board board = createBoard(move(1, Mark.CIRCLE), move(2, Mark.CIRCLE), move(3, Mark.CIRCLE), move(4, Mark.CIRCLE),
                move(5, Mark.CIRCLE), move(6, Mark.CIRCLE), move(7, Mark.CIRCLE), move(8, Mark.CIRCLE), move(9, Mark.CIRCLE));
        Set<Field> expectedAvailableMoves = moves();
        //when
        Set<Field> availableFieldsOnEmptyBoard = board.getAvailableFields();
        //then
        Assert.assertEquals(availableFieldsOnEmptyBoard, expectedAvailableMoves);
    }

    @DataProvider(name = "allMoves")
    public static Object[][] allMoves() {
        Object[][] fields = new Object[18][2];
        for (int i = 0; i < 18; i++) {
            fields[i][0] = new Field(i + 1);
            fields[i][1] = Mark.CIRCLE;
        }
        for (int i = 0; i < 9; i++) {
            fields[i + 9][0] = new Field(i + 1);
            fields[i + 9][1] = Mark.CROSS;
        }
        return fields;
    }

    @DataProvider(name = "oMoves")
    public static Object[][] oMoves() {
        Object[][] fields = new Object[9][2];
        for (int i = 0; i < 9; i++) {
            fields[i][0] = new Field(i + 1);
            fields[i][1] = Mark.CIRCLE;
        }
        return fields;
    }

    @DataProvider(name = "xMoves")
    public static Object[][] xMoves() {
        Object[][] fields = new Object[9][2];
        for (int i = 0; i < 9; i++) {
            fields[i][0] = new Field(i + 1);
            fields[i][1] = Mark.CIRCLE;
        }
        return fields;
    }

    private Object move(int position, Mark mark) {
        return new Object[]{position, mark};
    }

    private Board createBoard(Object... objects) {
        Map<Field, Mark> board = new SimpleMapBoardBuilder().createMap();
        for (int i = 0; i < objects.length; i++) {
            Object[] field = (Object[]) objects[i];
            Integer position = (Integer) field[0];
            Mark mark = (Mark) field[1];
            board.put(new Field(position), mark);
        }
        return new SimpleMapBoard(board);
    }

    private Set<Field> moves(int... moves) {
        HashSet<Field> availableMoves = new HashSet<>();
        for (int move : moves) {
            availableMoves.add(new Field(move));
        }
        return availableMoves;
    }
}
