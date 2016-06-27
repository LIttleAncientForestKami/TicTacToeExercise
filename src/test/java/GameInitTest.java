import com.awesomeTTTOO.engine.GameInit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;
/**
 * Created by bartlomiej on 27.06.16.
 */
public class GameInitTest {

    GameInit gameInit;

    @BeforeClass
    public void init(){
        gameInit = new GameInit();
    }

    @Test
    public void gameInitialized(){
        assertNotNull(gameInit);
        assertTrue(gameInit.gameRunning());
    }




    @AfterClass
    public void teardown(){
        gameInit=null;
    }
}
