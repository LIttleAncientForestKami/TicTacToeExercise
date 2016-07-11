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
        fieldState.put(ONE,EMPTY);
        fieldState.put(TWO,EMPTY);
        fieldState.put(THREE,EMPTY);
        fieldState.put(FOUR,EMPTY);
        fieldState.put(FIVE, O);
        fieldState.put(SIX,EMPTY);
        fieldState.put(SEVEN,EMPTY);
        fieldState.put(EIGHT,EMPTY);
        fieldState.put(NINE,EMPTY);
        return fieldState;
    }
}
