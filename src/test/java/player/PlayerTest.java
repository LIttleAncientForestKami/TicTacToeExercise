package player;

import board.Mark;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PlayerTest {
    private Player pl1 = new Player("pl1", Mark.O);
    private Player pl2 = new Player("pl2", Mark.X);

    @Test
    public void testPlayer() {
        Assert.assertTrue(pl1.toString().equals( "pl1 [O]" ));
        Assert.assertTrue(pl2.toString().equals( "pl2 [X]" ));
    }
}
