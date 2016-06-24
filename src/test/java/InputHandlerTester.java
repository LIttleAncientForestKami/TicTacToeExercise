import com.awesomeTTTOO.engine.InputHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;
/**
 * Created by bartlomiej on 24.06.16.
 */
public class InputHandlerTester {

    InputHandler inputHandler;

    @BeforeClass
    public void init(){
        inputHandler=new InputHandler();
    }

    @Test
    public void inputIsCreated(){
        assertNotNull(inputHandler);
    }

    //Actually this seems hard to be tested
    // For this moment I am putting this test to rest to rethink it
    /*
    @Test
    public void inputIsParsed(){
        assertEquals(5,inputHandler.handleInput());
    }
    */

    @AfterClass
    public void teardown(){
        inputHandler=null;
    }
}
