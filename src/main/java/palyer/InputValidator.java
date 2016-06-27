package palyer;


import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

/**
 * Created by kuba on 27.06.16.
 */
public class InputValidator {

    private Set<Integer> fields;

    public InputValidator() {
        fields = new HashSet<>();
    }

    public boolean validate(int i) {
        if (fields.contains(i)) {
            fields.remove(i);
            return true;
        }
        throw new InputMismatchException();
    }

    public void init() {
        for (int i = 1; i <= 9; i++) {
            fields.add(i);
        }
    }
}
