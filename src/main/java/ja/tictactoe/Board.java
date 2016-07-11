package ja.tictactoe;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Olga Ermolaeva on 07.07.16.
 */
public class Board {

    private Map<Position, Symbol> fieldState;

    public Board(Map<Position, Symbol> fieldState) {
        this.fieldState = fieldState;
    }

    public Symbol whatSymbolIsOnThePosition(Position position) {
        return fieldState.get(position);
    }
}
