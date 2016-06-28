package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ehsan on 24.06.16.
 */
public class PlayerXTest {

    @Test
    public void playerXShapeTest(){
        Player player = new PlayerX("Name", "Surname", PlayerType.HUMAN);

        Assert.assertEquals(Shape.X, player.shape());
    }

    @Test
    public void playerOShapeTest(){
        Player player = new PlayerO("Name", "Surname", PlayerType.HUMAN);

        Assert.assertEquals(Shape.O, player.shape());
    }

}
