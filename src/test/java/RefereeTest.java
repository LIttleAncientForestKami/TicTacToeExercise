import com.awesomeTTTOO.board.Board;
import com.awesomeTTTOO.referee.Referee;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static
        org.testng.Assert.*;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class RefereeTest {

    Referee referee;
    Board board;

    @BeforeClass
    public void init(){
        referee = new Referee();
        board = new Board(3);
    }

    @Test
    public void testIfWon(){
        assertEquals(false,referee.checkIfSomeoneWon(board));
    }





    @AfterClass
    public void teardown(){
        referee=null;
    }
}
