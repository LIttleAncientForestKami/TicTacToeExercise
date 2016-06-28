package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ehsan on 28.06.16.
 */
public class PlayerControllerTest {

    @Test
    public void playerType(){

        PlayerController playerController = new SimplePlayerController(PlayerType.HUMAN, PlayerType.HUMAN);



        Assert.assertEquals(playerController.getTypeOfPlayer(Shape.X), PlayerType.HUMAN);

    }


}
