import com.awesomeTTTOO.engine.GameRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class GameRunnerTest {

    GameRunner gameRunner;

    @BeforeClass
    public void init(){
        gameRunner = new GameRunner();
    }

    @Test
    public void gameInitialized(){
        assertNotNull(gameRunner);

    }


    @AfterClass
    public void teardown(){
        gameRunner =null;
    }
}
