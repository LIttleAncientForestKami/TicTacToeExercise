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


    @BeforeClass
    public void init(){
        referee = new Referee();
    }

    @Test
    public void testIfWon(){
        assertTrue(referee.checkIfSomeoneWon());
    }





    @AfterClass
    public void teardown(){
        referee=null;
    }
}
