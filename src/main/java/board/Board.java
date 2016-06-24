package board;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kuba on 23.06.16.
 */
public class Board {

    Map<Integer, String> board = new HashMap<>();

    public void putMarkOnTable(int s, String i) {
        board.put(5,"O");
    }
}
