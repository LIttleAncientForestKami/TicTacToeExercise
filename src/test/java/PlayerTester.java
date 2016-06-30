import com.awesomeTTTOO.board.BoardManager;
import com.awesomeTTTOO.players.Player;
import com.awesomeTTTOO.players.PlayerO;
import com.awesomeTTTOO.players.PlayerX;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;



/**
 * Created by bartlomiej on 24.06.16.
 */
public class PlayerTester {
    Player x;
    Player o;
    BoardManager bm;

    @BeforeClass
    public void init(){
        x = new PlayerX();
        o = new PlayerO();
        bm = new BoardManager();
    }


    @Test
    public void playersAreCreated(){
        assertNotNull(x);
        assertNotNull(o);
    }

    @AfterClass
    public void teardown(){
        x=null;
        o=null;
    }
}
