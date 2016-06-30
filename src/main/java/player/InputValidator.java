package player;


import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

public class InputValidator {

    private Set<Integer> fields;

    InputValidator(Set<Integer> fields) {
        this.fields = fields;
    }

    public static InputValidator getValidator() {
        Set<Integer> fields = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            fields.add(i);
        }
        return new InputValidator(fields);
    }

    boolean validate(int i) {
        if (fields.contains(i)) {
            fields.remove(i);
            return true;
        }
        throw new InputMismatchException();
    }

    @Override
    public boolean equals(Object obj) {
        InputValidator validator = (InputValidator) obj;
        return this.fields.equals(validator.fields);
    }

}
