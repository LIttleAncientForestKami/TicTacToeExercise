package com.epam.tictactoe.board;

import com.epam.tictactoe.board.IPosition;
import com.epam.tictactoe.board.Position;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by grzegorz_sledz on 24.06.16.
 */
public class PositionTest {

    @Test()
    public void equalityOfTwoTheSamePostionShouldBeTrue() {
        Assert.assertFalse(new Position(5).equals(new Position(4)));
        Assert.assertTrue(new Position(5).equals(new Position(5)));
    }
}