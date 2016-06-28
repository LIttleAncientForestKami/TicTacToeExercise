package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.arbiter.ArbiterHelper;
import epam.ja.krk.tictactoe.map.TicTacToeField;

import java.util.HashMap;

/**
 * Created by ehsan on 28.06.16.
 */
public interface MachinePlayer {
    String whatIsTheNextMove(HashMap<String, TicTacToeField> map, ArbiterHelper helper);
}
