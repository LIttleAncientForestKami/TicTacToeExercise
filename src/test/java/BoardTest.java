import com.awesomeTTTOO.board.Board;
import com.awesomeTTTOO.board.BoardManager;
import com.awesomeTTTOO.board.Signs;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class BoardTest extends Board {
    Board board;
    String representation;

    @BeforeClass
    public void init(){
        int size = new BoardManager().boardSize(3);
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
    public void initializeBoard(){
        assertEquals(" ",board.showField(3));

    }

    @Test
    public void checkState(){
        assertEquals(" ",board.currentState().get(1));
    }

    @Test
    public void correctSign(){
        assertEquals("X",Signs.X.toString());
        assertEquals("O",Signs.O.toString());
        assertEquals(" ",Signs.EMPTY.toString());
    }

    @Test
    public void boardDrawn(){
        assertEquals(representation,board.boardDrawn(3));
    }

    @AfterClass
    public void teardown(){
        board =null;
    }
}
