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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            if(board.containsKey(i)) builder.append(new Field(board.get(i)));
            else builder.append(new Field(i));
            if (i % 3 == 0) builder.append("\n");
        }
        return builder.toString();
    }
}
