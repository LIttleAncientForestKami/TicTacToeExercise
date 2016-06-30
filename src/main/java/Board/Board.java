package Board;

import java.util.Map;

public class Board {
    Map<Integer, Mark> board;

    public Board(Map<Integer, Mark> board) {
        this.board = board;
    }

    public void appliesMark(int fieldNumber, Mark mark) {
        board.put(fieldNumber, mark);
    }

    public Mark getMarkAtField(int fieldNumber) {
        return board.get(fieldNumber);
    }
}
