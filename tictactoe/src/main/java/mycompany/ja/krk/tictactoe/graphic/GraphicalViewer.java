package epam.ja.krk.tictactoe.graphic;

import epam.ja.krk.tictactoe.arbiter.Arbiter;
import epam.ja.krk.tictactoe.environment.Environment;
import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeField;
import epam.ja.krk.tictactoe.map.TicTacToeMap;

import java.util.List;
import java.util.Map;

/**
 * Created by ehsan on 24.06.16.
 */
public interface GraphicalViewer {

    /**
     * Displaying the map.
     * @param map
     */
    void displayMap(TicTacToeMap map);

    /**
     *
     * @param theShapeOfThePlayer - the shape
     * @param currentMap - we need the map to decide if the player is a machine and doesnt have an eye.
     * @return
     */
    String whatIsTheNextMove(Shape theShapeOfThePlayer, Map<String, TicTacToeField> currentMap);

    /**
     * Just printing what is send to the parameter
     * @param str
     */
    void informThat(String str);

    /**
     * To present the winner
     * @param environment
     */
    void showWinner(Environment environment);
}
