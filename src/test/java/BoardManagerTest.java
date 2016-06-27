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
    String representation;

    @BeforeClass
    public void init(){
        boardManager = new BoardManager();
        representation="| || || |\n" +
                "| ||O|| |\n"+
                "| || || |\n";


    }

    @Test
    public void boardManagerCreation(){
        assertNotNull(boardManager);
    }

    /*
    Test left for the future
    @Test
    public void sizeTester(){
        int size = boardManager.boardSize();
        assertEquals(9,size);

    }*/

    @Test
    public void putInBoardTester(){
        boardManager.putInBoard(5, "O");
        assertEquals("O",boardManager.showField(5));
        assertEquals(representation,boardManager.boardDrawn(3));
    }


    @AfterClass
    public void teardown(){
        boardManager=null;
    }
}
