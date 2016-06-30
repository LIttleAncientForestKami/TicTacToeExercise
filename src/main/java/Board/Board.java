package Board;

import java.util.HashMap;
import java.util.Map;

public class Board {
    Map<Integer, String> board = new HashMap<>();

    public void appliesMark(int fieldNumber, String mark) {
        board.put(fieldNumber, mark);
    }

    public String getMarkAtField(int fieldNumber) {
        return board.get(fieldNumber);
    }
}
