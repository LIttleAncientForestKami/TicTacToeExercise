package com.maciejkocur.tictactoe.Board.impl;

import com.maciejkocur.tictactoe.Board.Board;
import com.maciejkocur.tictactoe.Board.Mark;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapBoardTest {


    @Test(dataProvider = "allMoves")
    public void appliesAnyMoveAtAnyEmptyField(Integer field, Mark mark) {
        //given
        Board board = createBoard();
        //when
        board.applyMark(field, mark);
        //then
        Assert.assertEquals(mark, board.getMarkAtField(field));
    }

    @Test(dataProvider = "oMoves")
    public void notAppliesOAtOccupiedField(Integer field, Mark mark) {
        //given
        Board board = createBoard(field(field, mark));
        //when
        board.applyMark(field, Mark.CROSS);
        //then
        Assert.assertEquals(mark, board.getMarkAtField(field));
    }

    @Test(dataProvider = "xMoves")
    public void notAppliesXAtOccupiedField(Integer field, Mark mark) {
        //given
        Board board = createBoard(field(field, mark));
        //when
        board.applyMark(field, Mark.CIRCLE);
        //then
        Assert.assertEquals(mark, board.getMarkAtField(field));
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
        Map<Integer, Mark> emptyBoard = new HashMap<>();
        for (int i = 0; i < objects.length; i++) {
            Object[] field = (Object[]) objects[i];
            Integer position = (Integer) field[0];
            Mark mark = (Mark) field[1];
            emptyBoard.put(position, mark);
        }
        return new SimpleMapBoard(emptyBoard);
    }
}
