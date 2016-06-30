package com.epam.tictactoe.player;

import com.epam.tictactoe.enums.Sign;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by grzegorz_sledz on 30.06.16.
 */
public class PlayerTest {

    @Test
    public void equalsOfTwoPlayerXShouldBeTrue() {
        Assert.assertTrue(new PlayerX().equals(new PlayerX()));
    }

    @Test
    public void equalsOfTwoPlayerOShouldBeTrue() {
        Assert.assertTrue(new PlayerO().equals(new PlayerO()));
    }

    @Test
    public void equalsOfTwoDifferentPlayerShouldBeFalse() {
        Assert.assertFalse(new PlayerX().equals(new PlayerO()));
    }

    @Test
    public void toStringPlayerO() {
        Assert.assertTrue(new PlayerO().toString().equals("Player O"));
    }

    @Test
    public void toStringPlayerX() {
        Assert.assertTrue(new PlayerX().toString().equals("Player X"));
    }

}
