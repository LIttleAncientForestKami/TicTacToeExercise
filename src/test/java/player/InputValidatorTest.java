package player;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * Created by kuba on 27.06.16.
 */
public class InputValidatorTest {
    @Test
    public void testInit() {
        InputValidator validator = new InputValidator();
        validator.init();
        Set<Integer> test = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            test.add(i);
        }
        InputValidator inputValidatorTest = new InputValidator(test);
        assertEquals(validator,inputValidatorTest);
    }

    @Test
    public void testValidateException() throws Exception {
        InputValidator validator = new InputValidator();
        validator.init();
        try {
            validator.validate(35);
            fail("expectedExceptions");
        }catch (InputMismatchException e){
            //WORKS
        }
    }

    @Test
    public void testValidate() throws Exception {
        InputValidator validator = new InputValidator();
        validator.init();
        Set<Integer> test = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            test.add(i);
        }
        validator.validate(4);
        test.remove(4);
        InputValidator inputValidatorTest = new InputValidator(test);
        assertEquals(validator,inputValidatorTest);
    }

}