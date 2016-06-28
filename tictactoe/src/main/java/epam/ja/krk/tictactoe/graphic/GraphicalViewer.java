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
    void displayMap(TicTacToeMap map);

    String whatIsTheNextMove(Shape theShapeOfThePlayer, Map<String, TicTacToeField> currentMap);

    void informThat(String str);

    void showWinner(Environment environment);
}
