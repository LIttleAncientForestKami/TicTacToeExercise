import com.awesomeTTTOO.board.Board;
import com.awesomeTTTOO.referee.WinningSequences;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




import static org.testng.Assert.*;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class WinningSequencesTester {

    WinningSequences winningSequences;
    Board board;

    @BeforeClass
    public void init(){
        winningSequences=new WinningSequences();
        board = new Board(3);

    }



//    @Test
//    public void removeNotWinnableSequenceTester(){
//
//        assertEquals(false, winningSequences.containSequence());
//    }

    @Test
    public void checkWinningSequence(){
        assertEquals("The game continues",winningSequences.playerWon(board));
    }

    @AfterClass
    public void teardown(){
        winningSequences=null;
    }
}
