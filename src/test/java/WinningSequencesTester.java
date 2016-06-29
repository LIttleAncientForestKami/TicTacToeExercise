import com.awesomeTTTOO.referee.WinningSequences;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


import static org.testng.Assert.*;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class WinningSequencesTester {

    WinningSequences winningSequences;

    @BeforeClass
    public void init(){
        winningSequences=new WinningSequences();

    }


    @Test
    public void checkWinningSequence(){
        assertEquals(true,winningSequences.playerWon());
    }

    @AfterClass
    public void teardown(){
        winningSequences=null;
    }
}
