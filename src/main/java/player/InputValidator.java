package player;


import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

/**
 * Created by kuba on 27.06.16.
 */
public class InputValidator {

    private Set<Integer> fields;

    InputValidator() {
        fields = new HashSet<>();
    }

    boolean validate(int i) {
        if (fields.contains(i)) {
            fields.remove(i);
            return true;
        }
        throw new InputMismatchException();
    }

    InputValidator(Set<Integer> fields) {
        this.fields = fields;
    }

    public void init() {
        for (int i = 1; i <= 9; i++) {
            fields.add(i);
        }
    }

    @Override
    public boolean equals(Object obj) {
        InputValidator validator = (InputValidator) obj;
        return this.fields.equals(validator.fields);
    }
}
