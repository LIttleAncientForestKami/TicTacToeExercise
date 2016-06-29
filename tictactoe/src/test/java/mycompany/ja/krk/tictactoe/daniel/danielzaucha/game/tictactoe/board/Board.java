package mycompany.ja.krk.tictactoe.daniel.danielzaucha.game.tictactoe.board;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ehsan on 28.06.16.
 */
public class Board {
    public Map<Integer, Sign> board = new HashMap<Integer, Sign>();

    public Board(int i) {
        board.put(5, Sign.O);

    }

    public void placeCharacterOnBoard(int i, Sign o) {

    }
}
