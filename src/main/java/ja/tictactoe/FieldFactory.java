package ja.tictactoe;

import java.util.HashMap;
import java.util.Map;

import static ja.tictactoe.Position.*;
import static ja.tictactoe.Symbol.*;

/**
 * Created by Olga Ermolaeva on 08.07.16.
 */
public class FieldFactory {

    public static Map<Position, Symbol> createField() {
        Map<Position, Symbol> fieldState = new HashMap<>();
        fieldState.put(FIVE, O);
        return fieldState;
    }
}
