package com.epam.tictactoe.board;

import com.epam.tictactoe.board.Dimension;
import com.epam.tictactoe.board.IDimension;
import com.epam.tictactoe.board.Position;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DimensionTest  {

    @Test()
    public void equalityOfTwoTheSameDimensionShouldBeTrue() {
        Assert.assertFalse(new Dimension(3).equals(new Dimension(2)));
        Assert.assertTrue(new Dimension(3).equals(new Dimension(3)));
    }
}
