package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.arbiter.ArbiterHelper;
import epam.ja.krk.tictactoe.map.TicTacToeField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ehsan on 28.06.16.
 */
public interface MachinePlayer {
    String whatIsTheNextMove(Map<String, TicTacToeField> currentMap);
}
