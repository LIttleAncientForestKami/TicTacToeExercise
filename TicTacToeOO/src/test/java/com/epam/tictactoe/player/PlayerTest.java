package com.epam.tictactoe.player;

import com.epam.tictactoe.board.IPosition;
import com.epam.tictactoe.board.Position;
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
    public void equalsOfPlayerAndNullShouldBeFalse() {
        Assert.assertFalse(new PlayerX().equals(null));
    }
    @Test
    public void toStringPlayerO() {
        Assert.assertTrue(new PlayerO().toString().equals("Player O"));
    }

    @Test
    public void toStringPlayerX() {
        Assert.assertTrue(new PlayerX().toString().equals("Player X"));
    }

    @Test
    public void signPlayerOShouldBeSignO() {
        Assert.assertEquals(new PlayerO().sign(),Sign.O);
    }

    @Test
    public void signPlayerXShouldBeSignX() {
        Assert.assertEquals(new PlayerX().sign(),Sign.X);
    }
    @Test
    public void lastTurnAfterPlayerCreationShouldBeNull() {
        IPlayer player=new PlayerX();
        Assert.assertNull(player.lastTurn());
    }
    @Test
    public void lastTurnAfterTurnToPostionFiveShouldBeFive() {
        IPlayer player=new PlayerX();
        player.saveTurn(new Position(5));
        Assert.assertEquals(player.lastTurn(),new Position(5));
    }

}
