package com.maciejkocur.tictactoe.Board.impl;

import com.maciejkocur.tictactoe.Board.Board;
import com.maciejkocur.tictactoe.Board.Mark;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapBoardTest {

    @DataProvider(name = "fields")
    public static Object[][] fields() {
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

    @Test(dataProvider = "fields")
    public void appliesAnyMoveAtAnyEmptyField(Integer field, Mark mark) {
        //given
        Board board = createBoard();
        //when
        board.applyMark(field, mark);
        //then
        Assert.assertEquals(mark, board.getMarkAtField(field));
    }

    @Test
    public void notAppliesMoveOnOccupiedField() {
        //given
        Board board = createBoard(field(5, Mark.CIRCLE));
        //when
        board.applyMark(5, Mark.CROSS);
        //then
        Assert.assertEquals(Mark.CIRCLE, board.getMarkAtField(5));
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
