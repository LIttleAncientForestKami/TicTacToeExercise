import com.awesomeTTTOO.board.Board;
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
    Board board;

    @BeforeClass
    public void init(){
        boardManager = new BoardManager();
        board = new Board(3);
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

    @Test
    public void fieldInput(){
        assertEquals(board.showField(3),boardManager.insertToBoard(3));
    }

    @AfterClass
    public void teardown(){
        boardManager=null;
    }
}
