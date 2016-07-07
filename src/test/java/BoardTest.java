import com.awesomeTTTOO.board.Board;
import com.awesomeTTTOO.board.BoardManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class BoardTest {
    Board board;
    String representation;
    BoardManager boardManager;

    @BeforeClass
    public void init(){
        boardManager = new BoardManager();
        int size = 3;
        board = new Board(size);
        representation="| || || |\n" +
                       "| || || |\n"+
                       "| || || |\n";

    }

    @Test
    public void createBoard(){
        assertNotNull(board);
    }

    @Test
    public void boardDrawn(){
        assertEquals(representation,boardManager.boardDrawn());
    }

    @AfterClass
    public void teardown(){
        board =null;
    }
}
