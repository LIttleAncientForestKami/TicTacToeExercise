import com.awesomeTTTOO.referee.WinningSequences;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class WinningSequencesTester {

    WinningSequences winningSequences;

    @BeforeClass
    public void init(){
        winningSequences=new WinningSequences();
    }





    @AfterClass
    public void teardown(){
        winningSequences=null;
    }
}
