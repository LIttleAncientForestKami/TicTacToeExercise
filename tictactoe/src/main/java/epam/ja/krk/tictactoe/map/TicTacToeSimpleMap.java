package epam.ja.krk.tictactoe.map;

import java.util.Map;

/**
 * Created by ehsan on 23.06.16.
 */
public class TicTacToeSimpleMap implements TicTacToeMap {

    private Map<String, TicTacToeField> map;

    public TicTacToeSimpleMap(Map<String, TicTacToeField> map) {
        this.map = map;
    }

    public TicTacToeField getField(String fieldNumber) {
        return new TicTacToeSimpleField();
    }

}
