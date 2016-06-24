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
        assertNotNull(boardManager);
    }

    @Test
    public void sizeTester(){
        int size = boardManager.boardSize(3);
        assertEquals(9,size);

    }

    @AfterClass
    public void teardown(){
        boardManager=null;
    }
}
