package com.maciejkocur.tictactoe.player.impl;

import com.maciejkocur.tictactoe.board.Mark;
import com.maciejkocur.tictactoe.player.Player;
import com.maciejkocur.tictactoe.ui.impl.SimpleInputReader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HumanPlayerTest {

    @Test(dataProvider = "marks")
    public void getsProperMark(Mark mark) {
        //given
        Player player = new HumanPlayer(new SimpleInputReader(), mark);
        Mark expectedMark = mark;
        //when
        Mark actualMark = player.getMark();
        //then
        Assert.assertEquals(actualMark, expectedMark);
    }

    @DataProvider(name = "marks")
    public static Object[][] marks() {
        Object[][] marks = new Object[2][1];
        marks[0][0] = Mark.CIRCLE;
        marks[1][0] = Mark.CROSS;
        return marks;
    }
}