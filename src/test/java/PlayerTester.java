import com.awesomeTTTOO.players.Player;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class PlayerTester {
    Player player;

    @BeforeClass
    public void init(){
        player = new Player();
    }


    @Test
    public void playerIsCreated(){
        assertNotNull(player);
    }


    @AfterClass
    public void teardown(){
        player=null;
    }
}
