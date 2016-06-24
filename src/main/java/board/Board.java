package board;

import palyer.Mark;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kuba on 23.06.16.
 */
public class Board {

    Map<Integer, Mark> board = new HashMap<>();

    public void putMarkOnBoard(int index, Mark mark) {
        board.put(index,mark);
    }
}
