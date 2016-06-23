package epam.ja.krk.tictactoe.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ehsan on 23.06.16.
 */
public class TicTacToeMapBuilder {


    public Map<String, TicTacToeField> simpleTicTacToeMap() {
        Map<String, TicTacToeField> map = new HashMap<String, TicTacToeField>();

        map.put("1", new TicTacToeSimpleField());
        map.put("2", new TicTacToeSimpleField());
        map.put("3", new TicTacToeSimpleField());
        map.put("4", new TicTacToeSimpleField());
        map.put("5", new TicTacToeSimpleField());
        map.put("6", new TicTacToeSimpleField());
        map.put("7", new TicTacToeSimpleField());
        map.put("8", new TicTacToeSimpleField());
        map.put("9", new TicTacToeSimpleField());

        return map;

    }
}
