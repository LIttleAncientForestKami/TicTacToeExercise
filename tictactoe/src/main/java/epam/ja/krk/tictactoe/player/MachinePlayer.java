package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeField;

import java.util.Map;

/**
 * Created by ehsan on 28.06.16.
 */
public interface MachinePlayer {
    String whatIsTheNextMove(Shape shape, Map<String, TicTacToeField> currentMap);
}
