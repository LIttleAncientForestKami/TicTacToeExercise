import com.awesomeTTTOO.board.BoardManager;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class BoardManagerTest {

    BoardManager boardManager;

    @BeforeClass
    public void init(){
        boardManager = new BoardManager();
    }

    @Test
    public void boardManagerCreation(){
        BoardManager bm = new BoardManager();
        assertNotNull(bm);
    }

    @Test
    public void sizeTester(){
        int size = boardManager.boardSize(5);
        assertEquals(25,size);

    }

    @AfterClass
    public void tearDown(){
        boardManager=null;
    }
}
