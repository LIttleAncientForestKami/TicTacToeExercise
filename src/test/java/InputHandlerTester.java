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


    @AfterClass
    public void teardown(){
        inputHandler=null;
    }
}
