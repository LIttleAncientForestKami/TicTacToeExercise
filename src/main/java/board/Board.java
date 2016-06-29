package board;

import player.Mark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    Map<Integer, Mark> board = new HashMap<>();

    public void putMarkOnBoard(int index, Mark mark) {
        board.put(index, mark);
    }

    List<Field> returnFields() {
        List<Field> fields = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (board.containsKey(i)) fields.add(new Field(board.get(i).toString()));
            else fields.add(new Field(i + ""));
        }
        return fields;
    }
}
