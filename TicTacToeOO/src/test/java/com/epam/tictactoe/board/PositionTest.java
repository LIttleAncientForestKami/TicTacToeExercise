package com.epam.tictactoe.board;

import com.epam.tictactoe.board.IPosition;
import com.epam.tictactoe.board.Position;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Grzegorz Sledz
 */
public class PositionTest {

    @Test()
    public void position1ToStringTest() {
        Assert.assertEquals("Position: 1",new Position(1).toString());
    }
}