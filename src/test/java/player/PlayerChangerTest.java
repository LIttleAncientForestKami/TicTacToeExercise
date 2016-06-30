package player;

import board.Mark;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test()
public class PlayerChangerTest {
    private Player p1, p2;
    private PlayerChanger pC = new PlayerChanger();

    PlayerChangerTest() {
        p1 = new Player("aa", Mark.O);
        p2 = new Player("bb", Mark.X);
    }

    @Test
    public void testChangingPlayers() {
        Assert.assertEquals(pC.changePlayer(p1, p1, p2), p2);
        Assert.assertEquals(pC.changePlayer(p2, p1, p2), p1);
    }
}
