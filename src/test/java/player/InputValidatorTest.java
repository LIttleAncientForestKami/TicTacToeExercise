package player;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class InputValidatorTest {
    @Test
    public void testInit() {
        InputValidator validator = InputValidator.getValidator();
        Set<Integer> test = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            test.add(i);
        }
        InputValidator inputValidatorTest = new InputValidator(test);
        assertEquals(validator, inputValidatorTest);
    }

    @Test
    public void testValidateException() {
        InputValidator validator = InputValidator.getValidator();try {
            validator.validate(35);
            fail("expectedExceptions");
        } catch (InputMismatchException e) {
            //WORKS
        }
    }

    @Test
    public void testValidate() throws Exception {
        InputValidator validator = InputValidator.getValidator();
        Set<Integer> test = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            test.add(i);
        }
        validator.validate(4);
        test.remove(4);
        InputValidator inputValidatorTest = new InputValidator(test);
        assertEquals(validator, inputValidatorTest);
    }

}