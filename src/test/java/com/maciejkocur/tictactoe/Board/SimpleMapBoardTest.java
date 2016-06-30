package com.maciejkocur.tictactoe.Board;

import com.maciejkocur.tictactoe.Board.impl.SimpleMapBoard;
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
        board.appliesMark(field, mark);
        //then
        Assert.assertEquals(mark, board.getMarkAtField(field));
    }

    private Board createBoard() {
        Map<Integer, Mark> emptyBoard = new HashMap<>();
        return new SimpleMapBoard(emptyBoard);
    }
}
