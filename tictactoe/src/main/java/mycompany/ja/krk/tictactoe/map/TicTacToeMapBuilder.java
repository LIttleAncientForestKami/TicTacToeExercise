package epam.ja.krk.tictactoe.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ehsan on 23.06.16.
 */
public class TicTacToeMapBuilder {


    public Map<String, TicTacToeField> simpleTicTacToeMap() {
        Map<String, TicTacToeField> map = new HashMap<String, TicTacToeField>();

        map.put("1", new TicTacToeSimpleField("1"));
        map.put("2", new TicTacToeSimpleField("2"));
        map.put("3", new TicTacToeSimpleField("3"));
        map.put("4", new TicTacToeSimpleField("4"));
        map.put("5", new TicTacToeSimpleField("5"));
        map.put("6", new TicTacToeSimpleField("6"));
        map.put("7", new TicTacToeSimpleField("7"));
        map.put("8", new TicTacToeSimpleField("8"));
        map.put("9", new TicTacToeSimpleField("9"));

        return map;

    }
}
