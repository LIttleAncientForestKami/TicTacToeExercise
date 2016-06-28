package board;

/**
 * Created by kuba on 28.06.16.
 */
public class Field {
    private String field;

    public Field(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "| " + field + " |";
    }
}
