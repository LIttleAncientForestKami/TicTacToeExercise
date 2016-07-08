package ja.tictactoe;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Olga Ermolaeva on 07.07.16.
 */
public class Board {

    private Map<Position, Symbol> fieldState = new HashMap<>();

    public Symbol whatSymbolIsOnThePosition(Position position) {
        return Symbol.O;
    }
}
